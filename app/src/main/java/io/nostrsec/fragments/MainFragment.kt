package io.nostrsec.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.nostrsec.R
import io.nostrsec.databinding.ActivityMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    lateinit var binding: ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityMainBinding.inflate(layoutInflater)
        return binding.root
    }

}