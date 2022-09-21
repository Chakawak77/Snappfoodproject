package krd.snapfood.address;

import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/AllAddress")

public class AddressController {

    private final AddressService addressService;
    private final AddressMapper addressMapper;

    @PostMapping
    private ResponseEntity<Void> save(@RequestBody AddressDTO addressDTO) {
        val address = addressMapper.toAddress(addressDTO);
        addressService.save(address);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    private ResponseEntity<AddressDTO> update(@RequestBody AddressDTO addressDTO) {
        val address = addressMapper.toAddress(addressDTO);
        return ResponseEntity.ok(addressMapper.toAddressDTO(addressService.update(address)));
    }

    @DeleteMapping("{id}")
    private ResponseEntity<Void> delete(@PathVariable Long id) {
        addressService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("{id}")
    private ResponseEntity<AddressDTO> findById(@PathVariable Long id) {
        val address = addressService.getById(id);
        return ResponseEntity.ok(addressMapper.toAddressDTO(address));
    }

    @GetMapping
    private ResponseEntity<List<AddressDTO>> findAll() {
        return ResponseEntity.ok(addressMapper.toAddressDTO(addressService.findAll()));
    }

}