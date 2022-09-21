package krd.snapfood.address;

import krd.snapfood.supplier.Supplier;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class AddressServiceImp implements AddressService{

   private final AddressRepository repository;

    @Override
    public Address save(Address address) {
        return repository.save(address);
    }

    @Override
    public Address update(Address address) {
        Address updateAddress=getById(address.getId());
        updateAddress.setLocation(address.getLocation());
        updateAddress.setPhoneNumber(address.getPhoneNumber());
        return repository.save(updateAddress);
    }

    @Override
    public void delete(Long id) {
      getById(id);
      repository.deleteById(id);
    }

    @Override
    public Address getById(Long id) {
        Optional<Address> optionalAddress = repository.findById(id);
        if (!optionalAddress.isPresent()) {
            throw new RuntimeException("Not Found");
        }
        return optionalAddress.get();

    }

    @Override
    public List<Address> findAllByUserApp_Id(Long userId) {
        return repository.findAllByUserApp_Id(userId);
    }


    @Override
    public List<Address> findAll() {
        return (List<Address>) repository.findAll();
    }
}
