package krd.snapfood.basketitem;


import krd.snapfood.basket.Basket;

public interface BasketItemService {

   BasketItem save(BasketItem basketItem);
   BasketItem update(BasketItem basketItem);
    void delete(Long id);
   BasketItem getById(Long id);

}
