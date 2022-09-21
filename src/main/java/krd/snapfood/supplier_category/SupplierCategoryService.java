package krd.snapfood.supplier_category;

import java.util.List;

public interface SupplierCategoryService {
    SupplierCategory save(SupplierCategory supplierCategory);

    SupplierCategory update(SupplierCategory supplierCategory);

    void delete(Long id);

    SupplierCategory getById(Long id);

    List<SupplierCategory> findAllBySupplier_Id(Long supplier_Id);
}
