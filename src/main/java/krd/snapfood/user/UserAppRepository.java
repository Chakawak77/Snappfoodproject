package krd.snapfood.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAppRepository extends PagingAndSortingRepository<UserApp,Long> {

}
