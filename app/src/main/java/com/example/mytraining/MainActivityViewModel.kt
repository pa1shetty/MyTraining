package com.example.mytraining

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    var number = 0
    fun addNumber() {
        number++
    }
}