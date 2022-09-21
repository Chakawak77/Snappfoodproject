package krd.snapfood.user;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "allUser")
@AllArgsConstructor
public class UserController {
    private UserAppService service;
    private UserAppMapper mapper;


    @PostMapping("/v1")
    public ResponseEntity save(@RequestBody UserAppDTO userDTO) {

        UserApp user = mapper.toUserApp(userDTO);
        service.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/v1")
    public ResponseEntity update(@RequestBody UserAppDTO userDTO) {
        UserApp user = mapper.toUserApp(userDTO);
        service.update(user);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
