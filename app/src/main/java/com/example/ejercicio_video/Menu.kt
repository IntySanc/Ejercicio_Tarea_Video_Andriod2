package com.example.ejercicio_video

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ejercicio_video.databinding.FragmentMenuBinding


class Menu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentMenuBinding = FragmentMenuBinding.inflate(inflater, container, false)

        binding.btnSuma.setOnClickListener {
            findNavController().navigate(R.id.go_suma)
        }

        binding.btnResta.setOnClickListener {
            findNavController().navigate(R.id.go_resta)
        }
        return binding.root
    }

}