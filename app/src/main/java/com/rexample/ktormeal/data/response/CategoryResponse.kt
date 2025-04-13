package com.rexample.ktormeal.data.response

import kotlinx.serialization.Serializable

@Serializable
data class CategoryResponse(
    val categories: List<Category>
)

@Serializable
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)
/*

@Serializable
data class MealResponse(
    val meals: List<Meal>
)

@Serializable
data class Meal(
    val strMeal: String,
    val strMealThumb: String,
    val idMeal: String
)

@Serializable
data class UserRequest(
    val username: String,
    val password: String
)

@Serializable
data class UserResponse(
    val token: String
)
*/
