package com.fitapp.food_dairy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "meals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MealType mealType;

    private LocalDateTime dateTime;

//    @ManyToMany(mappedBy = "meal", cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "products",
//            joinColumns = @JoinColumn(name = "meal_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id")
//    )
    private List<MealProduct> mealProducts;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
