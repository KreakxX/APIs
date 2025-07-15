package com.kreakxX.FoodAPI;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<FoodObject, String> {

    List<FoodObject> findBycategoryName(String categoryName);

}
