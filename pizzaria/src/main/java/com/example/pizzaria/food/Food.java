package com.example.pizzaria.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Description of Food
 * Created by calle on 29/11/2023.
 */
@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String descricao;
    private String image;
    private Double price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
        this.descricao = data.descricao();
    }
}
