package krd.snapfood.basket;

import java.util.List;

public interface BasketService {
    Basket save(Basket basket);

    Basket update(Basket basket);

    void delete(Long id);

    Basket getById(Long id);

    List<Basket> findAll();
    List<Basket> findAllSupplier_Id(Long supplierId);
    List<Basket> findAllAddress_Id(Long addressId);
}
