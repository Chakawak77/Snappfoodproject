package krd.snapfood.basket_item;


import java.util.List;

public interface BasketItemService {

   BasketItem save(BasketItem basketItem);
   BasketItem update(BasketItem basketItem);
    void delete(Long id);
   BasketItem getById(Long id);
    List<BasketItem> findAllByBasket_Id(Long basketId);
    List<BasketItem> findAllBySupplierCategory_Id(Long supplierCategoryId);


}
