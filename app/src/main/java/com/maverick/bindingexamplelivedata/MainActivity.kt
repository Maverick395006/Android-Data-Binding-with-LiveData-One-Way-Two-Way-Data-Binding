package com.maverick.bindingexamplelivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.maverick.bindingexamplelivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//        mainViewModel.quoteLiveData.observe(this,{
//            binding.quoteText.text = it
//        })
        binding.lifecycleOwner = this  // if we are using livedata in binding then we have to set LifecycleOwner // Hower on lifecycle owner to get information

//        binding.btnUpdate.setOnClickListener{
//            mainViewModel.updateQuote()
//        }
        binding.mainViewModel = mainViewModel
    }
}