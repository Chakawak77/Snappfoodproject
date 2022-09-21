package krd.snapfood.food;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "foods")
public class FoodController {

    private final FoodService service;
    private FoodMapper mapper;

    @PostMapping("/v1/save")
    public ResponseEntity save(@RequestBody FoodDTO foodDTO) {
        Food food = mapper.toFood(foodDTO);
        service.save(food);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/v1/food")
    public ResponseEntity update(@RequestBody FoodDTO foodDTO) {
        Food food = mapper.toFood(foodDTO);
        service.update(food);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<FoodDTO> getById(@PathVariable Long id) {
        Food food = service.getById(id);
        FoodDTO foodDTO = mapper.toFoodDTO(food);
        return ResponseEntity.ok(foodDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.deleteBYId(id);
        return ResponseEntity.ok().build();
    }

}
