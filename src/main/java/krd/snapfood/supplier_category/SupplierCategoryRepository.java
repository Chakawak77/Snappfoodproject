package krd.snapfood.supplier_category;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierCategoryRepository extends PagingAndSortingRepository<SupplierCategory,Long> {

    List<SupplierCategory> findAllBySupplier_Id(Long supplierId);
}
