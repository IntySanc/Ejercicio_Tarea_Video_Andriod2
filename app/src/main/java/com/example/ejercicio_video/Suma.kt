package com.example.ejercicio_video

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ejercicio_video.databinding.FragmentSumaBinding


class Suma : Fragment() {
    lateinit var binding: FragmentSumaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSumaBinding.inflate(inflater, container, false)

        start ()

        return binding.root

    }

    private fun start (){
        binding.btnSuma.setOnClickListener {
            val num1: Int = binding.tfNum1.editText?.text.toString().toIntOrNull() ?:0
            val num2: Int = binding.tfNum2.editText?.text.toString().toIntOrNull() ?:0
            val resultado: Int= suma(num1, num2)
            binding.Resultado.text = resultado.toString()
        }


    }
    private fun suma (num1: Int, num2: Int): Int {
        return num1 + num2

    }

}