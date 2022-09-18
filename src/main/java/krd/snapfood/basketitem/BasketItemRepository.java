package krd.snapfood.basketitem;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketItemRepository extends PagingAndSortingRepository<BasketItem,Long> {

    List<BasketItem> findAllBySupplierCategory_Id(Long supplierCategory_Id);

    List<BasketItem> findAllByBasket_Id(Long basket_Id);

}
