package io.nostrsec

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.nostrsec.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.text = "Count $count"
        setHelloWold()
    }

    private fun setHelloWold() {
        binding.btn1.setOnClickListener {
            count++
            binding.btn1.text = "Count $count"
        }
    }

}