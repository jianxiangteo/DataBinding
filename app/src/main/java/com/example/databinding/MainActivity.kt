package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding as ActivityMainBinding1

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        val s = Student("W123", "John" )

        binding.myData = s

        binding.btnupdated.setOnClickListener(){
            s.studentName ="Alex"
            binding.apply {
                invalidateAll()
            }
        }
    }
}