package com.example.mytraining

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mytraining.databinding.ActivityMainBinding
//test
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val viewModel= ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.tvValue.text=viewModel.number.toString()

        binding.btnAdd.setOnClickListener {
            viewModel.addNumber()
            binding.tvValue.text = viewModel.number.toString()
        }

    }
}