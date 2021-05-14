package com.example.myfoodapp.modelo2
import com.google.gson.annotations.SerializedName
class ComidasJSON {
    @SerializedName("banner")
    val banner = arrayOf<String>()
    @SerializedName("categories")
    val categories = arrayOf<Categorie>()
    @SerializedName("food")
    val food = arrayOf<Food>()
}