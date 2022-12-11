package com.example.triviaquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import com.example.triviaquiz.databinding.FragmentDifficultyBinding

class DifficultyFragment : Fragment() {
    lateinit var binding: FragmentDifficultyBinding
    private val options = ArrayList<TextView>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding = FragmentDifficultyBinding.inflate(layoutInflater,container,false)
        options.add(0,binding.tvOptionEasy)
        options.add(1,binding.tvOptionMedium)
        options.add(2,binding.tvOptionHard)

        binding.tvOptionEasy.setOnClickListener{
            defaultOptionView()
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionMedium.setOnClickListener{
            defaultOptionView()
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionHard.setOnClickListener {
            defaultOptionView()
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        return binding.root
    }
    fun defaultOptionView(){
        for(option in options){
            option.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.default_option_border
            )
        }
    }
}