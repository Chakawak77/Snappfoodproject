package krd.snapfood.basket_item;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "basketItems")
public class BasketItemController {

    private final BasketItemService basketItemService;
    private final BasketItemMapper basketItemMapper;


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody BasketItemDTO basketItemDTO) {
        BasketItem basketItem= basketItemMapper.toBasketItem(basketItemDTO);
        basketItemService.save(basketItem);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<BasketItemDTO> update(@RequestBody BasketItemDTO basketItemDTO) {
        BasketItem basketItem= basketItemMapper.toBasketItem(basketItemDTO);
        BasketItemDTO saveUpdate = basketItemMapper.toBasketItemDTO(basketItemService.update(basketItem));
        return ResponseEntity.ok(saveUpdate);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        basketItemService.delete(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/SupplierCategory/{id}")
    public ResponseEntity<List<BasketItemDTO>> findSupplierByCategoryId(@PathVariable Long id) {
        List<BasketItemDTO> basketItemDTOS= basketItemMapper.toBasketItemListDTO(basketItemService.findAllBySupplierCategory_Id(id));

        return ResponseEntity.ok(basketItemDTOS);
    }
    @GetMapping("/baskets/{id}")
    public ResponseEntity<List<BasketItemDTO>> findBasketId(@PathVariable Long id) {
        List<BasketItemDTO> basketItemDTOS= basketItemMapper.toBasketItemListDTO(basketItemService.findAllByBasket_Id(id));

        return ResponseEntity.ok(basketItemDTOS);
    }

}
