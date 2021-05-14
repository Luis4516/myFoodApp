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
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {
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
        val view = inflater.inflate(R.layout.blankfragment2, container, false)
        val url1 = "https://d1uz88p17r663j.cloudfront.net/original/8689e8d974203563ddcc9bbff91323c2_MG_CHORIZOBURGER_Main-880x660.png"
        val url2 = "https://www.nestleprofessional.com.mx/sites/g/files/gfb321/f/styles/recipe/public/media/hamburguesa_0.jpg?itok=gUedPG84"
        val url3 = "https://www.lavanguardia.com/files/og_thumbnail/uploads/2019/01/14/5e997776af7b3.jpeg"
        val url4 = "https://cdn.colombia.com/gastronomia/2016/11/17/hamburguesa-artesanal-3029.jpg"
        val context: Context = requireContext().applicationContext

        val burger1 = Comida("Hamburguesa de Chorizo","XX",90.00, url1)
        val burger2 = Comida("Hamburguesa de Res","XX",65.00, url2)
        val burger3 = Comida("Hamburguesa de Grillo","XX",120.00, url3)
        val burger4 = Comida("Hamburguesa Artesanal","XX",140.00, url4)

        val miLista = view.findViewById<ListView>(R.id.myListView2)
        val listaComida = listOf(burger1, burger2, burger3, burger4)
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
         * @return A new instance of fragment BlankFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}