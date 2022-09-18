package krd.snapfood.supplier;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Repository
@AllArgsConstructor
public class SupplierServiceImp implements  SupplierService{

    private final SupplierRepository repository;
    private final SupplierService service;


    @Override
    public Supplier save(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier update(Supplier supplier) {
        Supplier updateSupplier=getById(supplier.getId());

        updateSupplier.setTitle(supplier.getTitle());
        updateSupplier.setUserName(supplier.getUserName());
        updateSupplier.setPassword(supplier.getPassword());
        updateSupplier.setLinkImage(supplier.getLinkImage());
        updateSupplier.setLocation(supplier.getLocation());

        return repository.save(updateSupplier);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Supplier getById(Long id) {

        Optional<Supplier> optionalSupplier=repository.findById(id);
        if (!optionalSupplier.isPresent()){
            throw new RuntimeException("Not Found");
        }
        return optionalSupplier.get();

}

    @Override
    public List<Supplier> getAllByCategory_Id(Long id) {

        return null;
    }


}
