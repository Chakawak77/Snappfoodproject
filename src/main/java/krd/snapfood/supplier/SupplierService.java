package krd.snapfood.supplier;


import java.util.List;

public interface SupplierService {

    Supplier save(Supplier supplier);

    Supplier update(Supplier supplier);

    void delete(Long id);

    Supplier getById(Long id);

    List<Supplier> getAllByCategory_Id(Long id);



}
