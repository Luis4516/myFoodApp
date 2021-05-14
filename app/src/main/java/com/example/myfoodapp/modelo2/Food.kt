package com.example.myfoodapp.modelo2
import com.google.gson.annotations.SerializedName
class Food {
    @SerializedName("name")
    val name:String? = null
    @SerializedName("price")
    val price:Double? = 0.0
    @SerializedName("categorie")
    val categorie:Int? = 0
    @SerializedName("image")
    val image:String? = null
}