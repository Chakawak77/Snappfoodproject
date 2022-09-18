package krd.snapfood.category;


public interface CategoryService {

    Category save(Category category);
    Category update(Category category);
    void delete(Long id);
    Category getById(Long id);

 }
