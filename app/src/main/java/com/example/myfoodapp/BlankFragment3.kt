package com.example.myfoodapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment3 : Fragment() {
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
        val view = inflater.inflate(R.layout.blankfragment3, container, false)
        val url1 = "https://media.istockphoto.com/photos/picking-slice-of-pepperoni-pizza-picture-id1133727757?k=6&m=1133727757&s=170667a&w=0&h=q_pGGPvB03yrmh30GVbGmZaqv--ggZZxJFJpEg7tE_M="
        val url2 = "https://imagenes.20minutos.es/files/image_656_370/uploads/imagenes/2020/02/05/pizza-margarita.jpeg"
        val url3 = "https://www.cocinavital.mx/wp-content/uploads/2018/06/pizza-hawaiana-e1548341621389.jpg"
        val url4 = "https://cdn.kiwilimon.com/recetaimagen/35832/43446.jpg"
        val context: Context = requireContext().applicationContext

        val pizza1 = Comida("Pizza de Pepperoni","XX",110.00, url1)
        val pizza2 = Comida("Pizza Italiana","XX",140.00, url2)
        val pizza3 = Comida("Pizza Hawaiana","XX",120.00, url3)
        val pizza4 = Comida("Pizza al Pastor","XX",180.00, url4)

        val miLista = view.findViewById<ListView>(R.id.myListView3)
        val listaComida = listOf(pizza1, pizza2, pizza3, pizza4)
        val adaptador = ComidaAdapter(context, listaComida)
        miLista.adapter = adaptador
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment3().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}