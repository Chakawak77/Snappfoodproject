package krd.snapfood.food;

import krd.snapfood.supplier_category.SupplierCategory;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FoodRepository extends PagingAndSortingRepository<Food,Long> {

     List<Food>   getAllBySupplierCategory(SupplierCategory supplierCategory );

     List<Food>   getAllBySupplierCategory_Id(Long id);

      List<Food> findAll(Specification<Food> specification);
}
