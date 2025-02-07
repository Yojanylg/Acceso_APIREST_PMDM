package com.example.ae_2_android_avanzado

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ae_2_android_avanzado.databinding.ItemserieBinding
import com.example.ae_2_android_avanzado.model.Serie
import com.squareup.picasso.Picasso

class SerieViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemserieBinding.bind(view)

    fun bind(serie : Serie){
        Picasso.get().load(serie.image).into(binding.ivSerie)
        binding.tvTitle.setText("Titulo: " + serie.title)
        binding.tvCreator.setText("Creador: " + serie.creator)
        binding.tvRating.setText("Puntuacion: " + serie.rating.toString())
        binding.tvdates.setText("Fecha: " + serie.dates)
    }
}