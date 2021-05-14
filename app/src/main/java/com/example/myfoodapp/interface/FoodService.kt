package com.example.myfoodapp.`interface`

import retrofit2.Call
import retrofit2.http.GET
import com.example.myfoodapp.modelo2.ComidasJSON

interface FoodService {
    @GET("foodapp/api.json")
    fun getFoods():Call<ComidasJSON>
}