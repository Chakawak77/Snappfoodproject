package krd.snapfood.address;

import krd.snapfood.supplier.Supplier;

import java.util.List;

public interface AddressService {

    Address save(Address address);

    Address update(Address address);

    void delete(Long id);

    Address getById(Long id);


    List<Address>   findAllByUserApp_Id(Long userId);

    List<Address> findAll();
}
