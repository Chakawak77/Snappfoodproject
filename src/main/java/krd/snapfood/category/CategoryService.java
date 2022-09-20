package krd.snapfood.category;


import java.util.List;

public interface CategoryService {

    Category save(Category category);
    Category update(Category category);
    void delete(Long id);
    Category getById(Long id);

    List<Category> findAll();
 }
