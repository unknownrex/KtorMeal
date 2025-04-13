package com.rexample.ktormeal.data.remote

import com.rexample.ktormeal.data.response.Category
import com.rexample.ktormeal.data.response.CategoryResponse
/*import com.rexample.ktormeal.data.response.Meal
import com.rexample.ktormeal.data.response.MealResponse
import com.rexample.ktormeal.data.response.UserRequest
import com.rexample.ktormeal.data.response.UserResponse*/
import io.ktor.client.call.body
import io.ktor.client.request.bearerAuth
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType

val baseUrl = "https://www.themealdb.com/api/"

suspend fun fetchCategories(): List<Category> {
    val response: CategoryResponse = KtorClient.client.get(
        "${baseUrl}json/v1/1/categories.php"
    ).body()

    return response.categories
}

/*
suspend fun fetchFilteredMeal(token: UserResponse, filter: Category): List<Meal> {
    val response: MealResponse = KtorClient.client.get(
        "https://www.themealdb.com/api/json/v1/1/filter.php?c=${filter.strCategory}"
    ){
        bearerAuth(token.token)
    }.body()

    return response.meals
}


fun getMeal(){
    val token = UserResponse(token = "92929292992")
    fetchFilteredMeal(
        token = token,
        filter = Category(
            strCategory = "",
            strCategoryThumb = "",
            strCategoryDescription = "",
            idCategory = ""
        )
    )
}

suspend fun postCataegory(token: UserResponse,newCategory: Category): HttpResponse {
    return KtorClient.client.post("${baseUrl}post") {
        contentType(ContentType.Application.Json)
        bearerAuth(token.token)
        setBody(newCategory)
    }
}

suspend fun checkAccount(userData: UserRequest): UserResponse {
    return KtorClient.client.post("https://www.themealdb.com/api/") {
        contentType(ContentType.Application.Json)
        setBody(userData)
    }.body()
}*/
