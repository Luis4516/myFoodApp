package com.example.myfoodapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast
import com.example.myfoodapp.`interface`.FoodService
import com.example.myfoodapp.modelo2.ComidasJSON
import com.example.myfoodapp.modelo2.Food
import com.example.myfoodapp.modelo2.FoodAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val miVista = inflater.inflate(R.layout.blankfragment1, container, false)
        val appContext:Context = requireContext().applicationContext

        // usar retrofit para recuperar JSON y convertir a objeto ComidasJSON
        val retrofit = Retrofit.Builder()
            .baseUrl("https://tutofox.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(FoodService::class.java)
        val call = service.getFoods()

        // formato para visualizar ListView
        val listaMostrar = mutableListOf<Food>()
        call.enqueue(object: Callback<ComidasJSON>{
            override fun onResponse(call: Call<ComidasJSON>?, response: Response<ComidasJSON>?) {
                val foods = response?.body()
                if(foods!=null){
                    for(food in foods.food){
                            listaMostrar.add(food)
                        //Toast.makeText(context, food.image, Toast.LENGTH_SHORT).show()
                    }
                }
                val miComidaAdapter = FoodAdapter(appContext,listaMostrar)
                val milista = miVista.findViewById<ListView>(R.id.myListView1B)
                milista.adapter = miComidaAdapter
            }


            override fun onFailure(call: Call<ComidasJSON>?, t: Throwable?) {
                TODO("Not yet implemented")
            }
        })


        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}