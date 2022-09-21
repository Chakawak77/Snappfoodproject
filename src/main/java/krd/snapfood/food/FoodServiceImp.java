package krd.snapfood.food;

import krd.snapfood.supplier_category.SupplierCategory;
import krd.snapfood.supplier_category.SupplierCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class FoodServiceImp implements FoodService{

    private final FoodRepository repository;
     private SupplierCategoryService supplierCategoryService;


    @Override
    public Food save(Food food) {
    return repository.save(food);

    }

    @Override
    public Food update(Food food) {
        return null;
    }

    @Override
    public void deleteBYId(Long id) {
     getById(id);
     repository.deleteById(id);
    }

    @Override
    public Food getById(Long id) {
        Optional<Food> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw new NotFoundException("Food not Found");
        }
        return optional.get();
    }

    @Override
    public List<Food> findBySupplierCategoryById(Long SupplierCategoryId) {
        SupplierCategory supplierCategory = supplierCategoryService.getById(SupplierCategoryId);
        return repository.getAllBySupplierCategory(supplierCategory);
    }

    @Override
    public List<Food> findAllBySupplierCategory_SupplierId(Long supplierId) {
        SupplierCategory supplierCategory = supplierCategoryService.getById(supplierId);
        return repository.getAllBySupplierCategory_Id(supplierCategory.getId());
    }
    }
