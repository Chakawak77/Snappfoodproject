package krd.snapfood.suppliercategory;

import krd.snapfood.basketitem.BasketItem;
import krd.snapfood.supplier.Supplier;

import java.util.List;

public interface SupplierCategoryService {
    SupplierCategory save(SupplierCategory supplierCategory);

    SupplierCategory update(SupplierCategory supplierCategory);

    void delete(Long id);

    SupplierCategory getById(Long id);

    List<SupplierCategory> findAllBySupplier_Id(Long supplier_Id);
}
