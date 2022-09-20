package krd.snapfood.category;


import krd.snapfood.supplier.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value="/v1/categories")
public class CategoryController {

    private final CategoryService serviceImp;
      private final CategoryMapper mapper;

    private final SupplierService supplierServiceImp;
    private final SupplierMapper supplierMapper;


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CategoryDTO categoryDTO) {
        Category category= mapper.toCategory(categoryDTO);
        serviceImp.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<CategoryDTO> update(@RequestBody CategoryDTO categoryDTO) {
        Category category= mapper.toCategory(categoryDTO);
        CategoryDTO saveUpdate = mapper.toCategoryDTO(serviceImp.update(category));
        return ResponseEntity.ok(saveUpdate);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        serviceImp.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/category/supplier/{id}")
    public ResponseEntity<List<SupplierDTO>> getAllSupplier(@PathVariable Long id) {
        List<SupplierDTO> supplierDTOS = supplierMapper.toSupplierDTO(supplierServiceImp.getAllByCategory_Id(id));

        return ResponseEntity.ok(supplierDTOS);
    }
    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getSupplierCategory() {
        List<CategoryDTO> categoryDTOS = mapper.toCategoryListDTO(serviceImp.findAll());
        return ResponseEntity.ok(categoryDTOS);
    }

}
