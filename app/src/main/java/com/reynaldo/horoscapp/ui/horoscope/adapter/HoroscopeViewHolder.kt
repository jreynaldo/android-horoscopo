package com.reynaldo.horoscapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.reynaldo.horoscapp.databinding.ItemHoroscopeBinding
import com.reynaldo.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder (view: View):RecyclerView.ViewHolder(view){
 private val binding =ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo) {
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = binding.tvTitle.context.getString(horoscopeInfo.name)
    }

}