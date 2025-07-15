package com.kreakxX.FoodAPI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository repository;

    public FoodObject getFoodByName(String name){
        return repository.findByFoodName(name);

    }

    public List<FoodObject> getFoodByCategories(String category){
        return repository.findBycategoryName(category);
    }

    public Object getFactByFood(String name, String method ) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        FoodObject object = repository.findByFoodName(name);
        Method m = FoodObject.class.getMethod(method);
        return m.invoke(object);
    }

    public List<FoodObject> getAllFoodObjects(){
        return repository.findAll();
    }

}
