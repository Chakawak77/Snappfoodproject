package krd.snapfood.category;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositor extends PagingAndSortingRepository<Category,Long>{

}
