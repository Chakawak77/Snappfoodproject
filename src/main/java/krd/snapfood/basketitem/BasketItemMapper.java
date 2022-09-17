package krd.snapfood.basketitem;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketItemMapper {

    BasketItem toBasketItem(BasketItemDTO basketItemDTO);
    BasketItemDTO toBasketItemDTO(BasketItem basketItem);

    List<BasketItem> toBasketItemList(List<BasketItemDTO> BasketItemDTOS);
    List<BasketItemDTO>  toBasketItemListDTO(List<BasketItem> basketItems);
}
