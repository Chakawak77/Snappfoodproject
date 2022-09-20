package krd.snapfood.supplier;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/suppliers")
public class SupplierController {

    private final SupplierServiceImp service;
    private final SupplierMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody SupplierDTO supplierDTO) {
        Supplier supplier= mapper.toSupplier(supplierDTO);
        service.save(supplier);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<SupplierDTO> update(@RequestBody SupplierDTO supplierDTO) {
        Supplier supplier= mapper.toSupplier(supplierDTO);
       SupplierDTO saveUpdate = mapper.toSupplierDTO(service.update(supplier));
        return ResponseEntity.ok(saveUpdate);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/SupplierCategory/{id}")
    public ResponseEntity<List<SupplierDTO>> findSupplierByCategoryId(@PathVariable Long id) {
        List<SupplierDTO> supplierDTOS= mapper.toSupplierDTO(service.getAllByCategory_Id(id));

        return ResponseEntity.ok(supplierDTOS);
    }

}
