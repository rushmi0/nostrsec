package io.nostrsec

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.nostrsec.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setHelloWold()
    }

    private fun setHelloWold() {
        binding.btn1.setOnClickListener {
            Toast.makeText(applicationContext, "Hey!!", Toast.LENGTH_SHORT).show()
        }
    }

}