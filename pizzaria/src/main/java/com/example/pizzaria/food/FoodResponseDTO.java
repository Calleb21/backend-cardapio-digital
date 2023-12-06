package com.example.pizzaria.food;

/**
 * Description of FoodResponseDTO
 * Created by calle on 30/11/2023.
 */
public record FoodResponseDTO(Long id, String title, String descricao, String image, Double price) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getDescricao(), food.getImage(), food.getPrice());
    }
}
