package com.kreakxX.FoodAPI;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
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
@RateLimiter(name = "foodApiLimiter")
public class FoodController {

    private final FoodService service;

    @GetMapping("/by/name/{name}")
    public FoodObject getFoodByName(@PathVariable String name){
        return service.getFoodByName(name);
    }

    @GetMapping("/by/category/{categories}")
    public List<FoodObject> getFoodsByCategories(@PathVariable String categories){
        return service.getFoodByCategories(categories);
    }

    @GetMapping("/facts/by/name/{name}/method/{method}")
    public Object getFoodFacts(@PathVariable String name, @PathVariable String method) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return service.getFactByFood(name,method);
    }

    @GetMapping("/getAll")
    public List<FoodObject> getAllFoods(){
        return service.getAllFoodObjects();
    }
}
