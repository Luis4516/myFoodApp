package com.example.myfoodapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.math.MathContext

class ComidaAdapter (private val mContext: Context, private val listaProductos: List<Comida>):ArrayAdapter<Comida>(mContext,0,listaProductos){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layout = LayoutInflater.from(mContext).inflate(R.layout.listaproducto,parent,false)
        val comidas = listaProductos[position]
        val txtNombre = layout.findViewById<TextView>(R.id.txtNombreP)
        val txtPrecio = layout.findViewById<TextView>(R.id.txtPrecioP)
        val imagen = layout.findViewById<ImageView>(R.id.imageView)

        Picasso.get().load(comidas.imagen).into(imagen)
        txtNombre.setText(comidas.nombre)
        txtPrecio.setText(comidas.precio.toString())

        return layout
    }
}

