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
 * Use the [BlankFragment4.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment4 : Fragment() {
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
        val view = inflater.inflate(R.layout.blankfragment4, container, false)
        val url1 = "https://i.pinimg.com/originals/6e/03/75/6e0375bddba8c20e393e445f7cab39fd.jpg"
        val url2 = "https://dam.cocinafacil.com.mx/wp-content/uploads/2019/05/Vampiro.jpg"
        val url3 = "https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2019/02/receta-de-tejuino.jpg"
        val url4 = "http://etilicos.com/wp-content/uploads/2013/08/bebidas-valiosas-9-Jack-Daniels.jpg"
        val context: Context = requireContext().applicationContext

        val drink1 = Comida("Laguna Azul","XX",55.00, url1)
        val drink2 = Comida("Bebida Vampiro","XX",45.00, url2)
        val drink3 = Comida("Tejuino","XX",10.00, url3)
        val drink4 = Comida("Whiskey Jack Daniel's","XX",390.00, url4)

        val miLista = view.findViewById<ListView>(R.id.myListView4)
        val listaComida = listOf(drink1, drink2, drink3, drink4)
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
         * @return A new instance of fragment BlankFragment4.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment4().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}