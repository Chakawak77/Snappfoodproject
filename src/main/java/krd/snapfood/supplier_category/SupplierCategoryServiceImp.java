package krd.snapfood.supplier_category;

import krd.snapfood.supplier.Supplier;
import krd.snapfood.supplier.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class SupplierCategoryServiceImp implements SupplierCategoryService {

    private final SupplierCategoryRepository supplierCategoryRepository;
    private final SupplierService supplierService;


    @Override
    public SupplierCategory save(SupplierCategory supplierCategory) {
        return supplierCategoryRepository.save(supplierCategory);
    }

    @Override
    public SupplierCategory update(SupplierCategory supplierCategory) {
        SupplierCategory updateSupplierCategory=getById(supplierCategory.getId());
        updateSupplierCategory.setTitle(supplierCategory.getTitle());
         return save(updateSupplierCategory);
    }

    @Override
    public void delete(Long id) {
     getById(id);
     supplierCategoryRepository.deleteById(id);
    }

    @Override
    public SupplierCategory getById(Long id) {
        Optional<SupplierCategory> optionalSupplierCategory =supplierCategoryRepository.findById(id);
        if (!optionalSupplierCategory.isPresent()) {
            throw new RuntimeException("Not Found");
        }
        return optionalSupplierCategory.get();

    }

    @Override
    public List<SupplierCategory> findAllBySupplier_Id(Long supplierId) {
        Supplier supplier = supplierService.getById(supplierId);
        return supplierCategoryRepository.findAllBySupplier_Id(supplier.getId());
}}
