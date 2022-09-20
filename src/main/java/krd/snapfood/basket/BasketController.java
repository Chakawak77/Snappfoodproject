package krd.snapfood.basket;


import krd.snapfood.supplier.SupplierDTO;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/baskets")
public class BasketController {
    private final BasketService service;
    private final BasketMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody BasketDTO basketDTO) {
        val basket = mapper.toBasket(basketDTO);
        service.save(basket);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<BasketDTO> update(@RequestBody BasketDTO basketDTO) {
        val basket = mapper.toBasket(basketDTO);
        val basketDto = mapper.toBasketDTO(service.update(basket));
        return ResponseEntity.ok(basketDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<BasketDTO> findById(@PathVariable Long id) {
        val basketDTO = mapper.toBasketDTO(service.getById(id));
        return ResponseEntity.ok(basketDTO);
    }

    @GetMapping
    public ResponseEntity<List<BasketDTO>> findAll() {
        val basketDTOS = mapper.toBasketDTOList(service.findAll());
        return ResponseEntity.ok(basketDTOS);
    }

    @GetMapping("/baskets/suppliers/{id}")
    public ResponseEntity<List<BasketDTO>> findSupplierBySupplierId(@PathVariable Long id) {
        List<BasketDTO> basketDTOS = mapper.toBasketDTOList(service.findAllSupplier_Id(id));

        return ResponseEntity.ok(basketDTOS);

    }
    @GetMapping("/baskets/address/{id}")
    public ResponseEntity<List<BasketDTO>> findSupplierByAddressId(@PathVariable Long id) {
        List<BasketDTO> basketDTOS = mapper.toBasketDTOList(service.findAllAddress_Id(id));

        return ResponseEntity.ok(basketDTOS);
}
}