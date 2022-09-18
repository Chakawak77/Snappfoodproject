package krd.snapfood.address;

import krd.snapfood.user.UserApp;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address,Long> {

    List<Address>   findAllByUserApp_Id(Long user_Id);

    //List<Address> findAllByUserApp(UserApp userApp);

}
