package krd.snapfood.category;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImp implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category) {

        Category updateCategory=getById(category.getId());
        updateCategory.setIcon(category.getIcon());
        updateCategory.setTitle(category.getTitle());

        return categoryRepository.save(updateCategory);
    }

    @Override
    public void delete(Long id) {
      getById(id);
      categoryRepository.deleteById(id);
    }

    @Override
    public Category getById(Long id) {
        Optional<Category> optionalCategory=categoryRepository.findById(id);
        if (!optionalCategory.isPresent())
            throw new RuntimeException("Not Found");

        return optionalCategory.get();
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }
}
