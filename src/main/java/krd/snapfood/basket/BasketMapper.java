package krd.snapfood.basket;

import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketMapper {

    Basket toBasket(BasketDTO basketDTO);
    BasketDTO toBasketDTO(Basket basket);

    List<Basket> toBasketList(List<BasketDTO> BasketDTOS);
    List<BasketDTO>  toBasketDTOList(List<Basket> baskets);

}
