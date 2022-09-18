package krd.snapfood.supplier;

import krd.snapfood.basket.Basket;
import krd.snapfood.category.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SupplierRepository extends PagingAndSortingRepository<Supplier,Long> {



    List<Supplier> findAllByCategory_Id(Long category_Id);


}
