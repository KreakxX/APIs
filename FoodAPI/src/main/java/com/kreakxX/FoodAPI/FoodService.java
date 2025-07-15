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
        return repository.findById(name).orElseThrow();
    }

    public List<FoodObject> getFoodByCategories(String category){
        return repository.findBycategoryName(category);
    }

    public Object getFactByFood(String name, String method ) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        FoodObject object = repository.findById(name).orElseThrow();
        Method m = FoodObject.class.getMethod(method);
        return m.invoke(object);
    }

}
