package com.rexample.ktormeal.data

import io.ktor.client.call.body
import io.ktor.client.request.get

val baseUrl = "https://www.themealdb.com/api/"

suspend fun fetchCategories(): List<Category> {
    val response: CategoryResponse = KtorClient.client.get(
        "https://www.themealdb.com/api/json/v1/1/categories.php"
    ).body()
    return response.categories
}