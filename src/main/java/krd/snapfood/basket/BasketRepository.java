package krd.snapfood.basket;

import krd.snapfood.address.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends PagingAndSortingRepository<Basket,Long> {

     List<Basket> findAllByAddress_Id(Long address_Id);

     List<Basket> findAllBySupplier_Id(Long id);

    // List<Basket> findAllByAddress(Address address);
}
