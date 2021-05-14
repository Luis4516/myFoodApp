package com.example.myfoodapp.modelo2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.myfoodapp.R
import com.squareup.picasso.Picasso

class FoodAdapter(private val mContext:Context, private val listacomida:MutableList<Food>):ArrayAdapter<Food>(mContext,0, listacomida) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutComida = LayoutInflater.from(mContext).inflate(R.layout.listaproducto, parent, false)
            val miImage2 = layoutComida.findViewById<ImageView>(R.id.imageView)
            val txtNameC2 = layoutComida.findViewById<TextView>(R.id.txtNombreP)
            val txtPrecioC2 = layoutComida.findViewById<TextView>(R.id.txtPrecioP)
            val miComida2 = listacomida[position]
            Toast.makeText(context, miComida2.image, Toast.LENGTH_SHORT).show()
            Picasso.get().load(miComida2.image).into(miImage2)
            txtNameC2.setText(miComida2.name)
            txtPrecioC2.setText(miComida2.price.toString())

            return layoutComida
    }
}