package krd.snapfood.food;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FoodMapper {

    Food  toFood(FoodDTO foodDTO);
    FoodDTO toFoodDTO(Food food);

    List<Food> toFoodList(List<FoodDTO> foodDTOS);
    List<FoodDTO> toFoodDTO(List<Food> foods);
}
