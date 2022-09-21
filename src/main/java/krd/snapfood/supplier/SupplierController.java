package krd.snapfood.supplier;

import krd.snapfood.basket.BasketDTO;
import krd.snapfood.basket.BasketMapper;
import krd.snapfood.basket.BasketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/suppliers")
public class SupplierController {

    private final SupplierService service;
    private final SupplierMapper mapper;

    private final BasketService basketService;

    private final BasketMapper basketMapper;


    @PostMapping("/save/supplier")
    public ResponseEntity<Void> save(@RequestBody SupplierDTO supplierDTO) {
        Supplier supplier= mapper.toSupplier(supplierDTO);
        service.save(supplier);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/update/supplier")
    public ResponseEntity<SupplierDTO> update(@RequestBody SupplierDTO supplierDTO) {
        Supplier supplier= mapper.toSupplier(supplierDTO);
       SupplierDTO saveUpdate = mapper.toSupplierDTO(service.update(supplier));
        return ResponseEntity.ok(saveUpdate);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/SupplierCategory/{id}")
    public ResponseEntity<List<SupplierDTO>> findSupplierByCategoryId(@PathVariable Long id) {
        List<SupplierDTO> supplierDTOS= mapper.toSupplierDTO(service.getAllByCategory_Id(id));

        return ResponseEntity.ok(supplierDTOS);
    }

  /*  @GetMapping("/viewAllBasket/{id}")
    public ResponseEntity<List<BasketDTO>> findAllBasket(@PathVariable Long id) {
        List<BasketDTO> basketDTOS= basketMapper.toBasketDTO(basketService.findAll());

        return ResponseEntity.ok(basketDTOS);
    }
*/
}
