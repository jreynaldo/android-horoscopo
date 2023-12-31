package com.reynaldo.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.reynaldo.horoscapp.domain.model.HoroscopeInfo
import com.reynaldo.horoscapp.domain.model.HoroscopeInfo.Aries
import com.reynaldo.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.reynaldo.horoscapp.domain.model.HoroscopeInfo.Gemini
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() : ViewModel() {
    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = listOf(
            Aries, Taurus, Gemini
        )
    }
}