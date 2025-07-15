package com.kreakxX.FoodAPI;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "nutrition")

@AllArgsConstructor
@NoArgsConstructor
public class FoodObject {

    @Id
    @Column(name = "Food Name")
    private String foodName;

    @Column(name = "Category Name")
    private String categoryName;

    @Column(name = "Calcium")
    private Double calcium;

    @Column(name = "Calories")
    private Double calories;

    @Column(name = "Carbs")
    private Double carbs;

    @Column(name = "Cholesterol")
    private Double cholesterol;

    @Column(name = "Copper")
    private Double copper;

    @Column(name = "Fats")
    private Double fats;

    @Column(name = "Fiber")
    private Double fiber;

    @Column(name = "Folate")
    private Double folate;

    @Column(name = "Iron")
    private Double iron;

    @Column(name = "Magnesium")
    private Double magnesium;

    @Column(name = "Monounsaturated Fat")
    private Double monounsaturatedFat;

    @Column(name = "Net carbs")
    private Double netCarbs;

    @Column(name = "Omega-3 - DHA")
    private Double omega3Dha;

    @Column(name = "Omega-3 - DPA")
    private Double omega3Dpa;

    @Column(name = "Omega-3 - EPA")
    private Double omega3Epa;

    @Column(name = "Phosphorus")
    private Double phosphorus;

    @Column(name = "Polyunsaturated fat")
    private Double polyunsaturatedFat;

    @Column(name = "Potassium")
    private Double potassium;

    @Column(name = "Protein")
    private Double protein;

    @Column(name = "Saturated Fat")
    private Double saturatedFat;

    @Column(name = "Selenium")
    private Double selenium;

    @Column(name = "Sodium")
    private Double sodium;

    @Column(name = "Trans Fat")
    private String transFat;

    @Column(name = "Vitamin A (IU)")
    private Double vitaminAIU;

    @Column(name = "Vitamin A RAE")
    private Double vitaminARae;

    @Column(name = "Vitamin B1")
    private Double vitaminB1;

    @Column(name = "Vitamin B12")
    private Double vitaminB12;

    @Column(name = "Vitamin B2")
    private Double vitaminB2;

    @Column(name = "Vitamin B3")
    private Double vitaminB3;

    @Column(name = "Vitamin B5")
    private Double vitaminB5;

    @Column(name = "Vitamin B6")
    private Double vitaminB6;

    @Column(name = "Vitamin C")
    private Double vitaminC;

    @Column(name = "Zinc")
    private Double zinc;

    @Column(name = "Choline")
    private String choline;

    @Column(name = "Fructose")
    private String fructose;

    @Column(name = "Histidine")
    private String histidine;

    @Column(name = "Isoleucine")
    private String isoleucine;

    @Column(name = "Leucine")
    private String leucine;

    @Column(name = "Lysine")
    private String lysine;

    @Column(name = "Manganese")
    private String manganese;

    @Column(name = "Methionine")
    private String methionine;

    @Column(name = "Phenylalanine")
    private String phenylalanine;

    @Column(name = "Starch")
    private String starch;

    @Column(name = "Sugar")
    private String sugar;

    @Column(name = "Threonine")
    private String threonine;

    @Column(name = "Tryptophan")
    private String tryptophan;

    @Column(name = "Valine")
    private String valine;

    @Column(name = "Vitamin D")
    private String vitaminD;

    @Column(name = "Vitamin E")
    private String vitaminE;

    @Column(name = "Vitamin K")
    private String vitaminK;

    @Column(name = "Omega-3 - ALA")
    private String omega3Ala;

    @Column(name = "Omega-6 - Eicosadienoic acid")
    private String omega6EicosadienoicAcid;

    @Column(name = "Omega-6 - Gamma-linoleic acid")
    private String omega6GammaLinoleicAcid;

    @Column(name = "Omega-3 - Eicosatrienoic acid")
    private String omega3EicosatrienoicAcid;

    @Column(name = "Omega-6 - Dihomo-gamma-linoleic acid")
    private String omega6DihomoGammaLinoleicAcid;

    @Column(name = "Omega-6 - Linoleic acid")
    private String omega6LinoleicAcid;

    @Column(name = "Omega-6 - Arachidonic acid")
    private String omega6ArachidonicAcid;
}
