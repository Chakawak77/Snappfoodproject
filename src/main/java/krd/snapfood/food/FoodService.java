package krd.snapfood.food;

import java.util.List;

public interface FoodService {

    Food save(Food food);
    Food update(Food food);
    void deleteBYId(Long id);
     Food getById(Long id);
    List<Food> findBySupplierCategoryById(Long SupplierCategoryId );
    List<Food> findAllBySupplierCategory_SupplierId (Long supplierId);
 }
