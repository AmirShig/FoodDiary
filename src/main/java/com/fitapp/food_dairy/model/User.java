package com.fitapp.food_dairy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name = "is_male")
    private boolean isMale;
    private int age;
    private double weight;
    private double height;

    @Column(name = "calories_goal")
    private double caloriesGoal;
    @Column(name = "protein_goal")
    private double proteinGoal;
    @Column(name = "carbs_goal")
    private double carbsGoal;
    @Column(name = "fats_goal")
    private double fatsGoal;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Meal> meals;
}
