package com.example.update_master_of_guitar.Adapter
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.update_master_of_guitar.Guitarrista
import com.example.update_master_of_guitar.databinding.ItemGuitarristaBinding

class GuitarraViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemGuitarristaBinding.bind(view)

    fun render(guitarraModel: Guitarrista){
        binding.tvNombre.text = guitarraModel.nombre
        binding.tvGrupo.text = guitarraModel.grupo
        binding.tvGuitarra.text = guitarraModel.guitarra
        Glide.with(binding.ivGuitarrista.context).load(guitarraModel.foto).into(binding.ivGuitarrista)
        binding.ivGuitarrista.setOnClickListener{
            Toast.makeText(
                binding.ivGuitarrista.context,
                guitarraModel.nombre,
                Toast.LENGTH_SHORT
            ).show()
        }
        itemView.setOnClickListener{
            Toast.makeText(
                binding.ivGuitarrista.context,
                guitarraModel.guitarra,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
