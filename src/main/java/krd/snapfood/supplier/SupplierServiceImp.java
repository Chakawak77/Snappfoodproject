package krd.snapfood.supplier;


import krd.snapfood.category.Category;
import krd.snapfood.category.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Repository
@AllArgsConstructor
public class SupplierServiceImp implements  SupplierService {

    private final SupplierRepository repository;
    private final CategoryService categoryService;


    @Override
    public Supplier save(Supplier supplier) {
        return repository.save(supplier);
    }

    @Override
    public Supplier update(Supplier supplier) {
        Supplier updateSupplier = getById(supplier.getId());

        updateSupplier.setTitle(supplier.getTitle());
        updateSupplier.setUserName(supplier.getUserName());
        updateSupplier.setPassword(supplier.getPassword());
        updateSupplier.setLinkImage(supplier.getLinkImage());
        updateSupplier.setLocation(supplier.getLocation());

        return repository.save(updateSupplier);
    }

    @Override
    public void delete(Long id) {
        getById(id);
        repository.deleteById(id);
    }

    @Override
    public Supplier getById(Long id) {

        Optional<Supplier> optionalSupplier = repository.findById(id);
        if (!optionalSupplier.isPresent()) {
            throw new RuntimeException("Not Found");
        }
        return optionalSupplier.get();

    }

    @Override
    public List<Supplier> getAllByCategory_Id(Long categoryId) {
         return repository.findAllByCategory_Id(categoryId);
    }
}
