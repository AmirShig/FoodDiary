package com.fitapp.food_dairy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "meal_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MealProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private double grams;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

}
