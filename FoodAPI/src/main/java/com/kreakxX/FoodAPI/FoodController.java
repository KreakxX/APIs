package com.kreakxX.FoodAPI;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("/api/food")
@AllArgsConstructor
public class FoodController {

    private final FoodService service;

    @GetMapping("/food/by/name/{name}")
    public FoodObject getFoodByName(@PathVariable String name){
        return service.getFoodByName(name);
    }

    @GetMapping("/foods/by/category/{categories}")
    public List<FoodObject> getFoodsByCategories(@PathVariable String category){
        return service.getFoodByCategories(category);
    }

    @GetMapping("/food/facts/by/name/{name}/method/{method}")
    public Object getFoodFacts(@PathVariable String name, @PathVariable String method) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return service.getFactByFood(name,method);
    }
}
