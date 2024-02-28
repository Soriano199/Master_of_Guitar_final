package com.example.ejemplo_recyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.update_master_of_guitar.Adapter.GuitarraViewHolder
import com.example.update_master_of_guitar.Guitarrista
import com.example.update_master_of_guitar.R

class GuitarraAdapter(private val guitarrasLista:List<Guitarrista>):RecyclerView.Adapter<GuitarraViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuitarraViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return GuitarraViewHolder(layoutInflater.inflate(R.layout.item_guitarrista, parent, false))
    }
    /**Retornamos el tamaño de la lista del Provider**/
    override fun getItemCount(): Int {
        return guitarrasLista.size
    }

    override fun onBindViewHolder(holder: GuitarraViewHolder, position: Int) {

        holder.render(guitarrasLista[position])
    }

}