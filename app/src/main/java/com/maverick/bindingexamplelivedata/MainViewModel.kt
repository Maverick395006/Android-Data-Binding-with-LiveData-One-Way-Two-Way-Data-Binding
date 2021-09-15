package com.maverick.bindingexamplelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    val quoteLiveData = MutableLiveData("What you give is what you get")

    fun updateQuote() {
        quoteLiveData.value ="You'll see it when you will believe it."
    }
}