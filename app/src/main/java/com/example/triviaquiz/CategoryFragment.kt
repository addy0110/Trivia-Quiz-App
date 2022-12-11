package com.example.triviaquiz

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.triviaquiz.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {
    private lateinit var binding: FragmentCategoryBinding
    private val options = ArrayList<TextView>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCategoryBinding.inflate(layoutInflater,container,false)
        options.add(0,binding.tvOptionAnimals)
        options.add(1,binding.tvOptionHistory)
        options.add(2,binding.tvOptionSports)
        options.add(3,binding.tvOptionMathematics)
        options.add(4,binding.tvOptionGk)

        binding.btDone.setOnClickListener{
            findNavController().navigate(R.id.action_categoryFragment_to_difficultyFragment)
        }
        binding.tvOptionAnimals.setOnClickListener{
            defaultOptionView()
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionHistory.setOnClickListener {
            defaultOptionView()
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionSports.setOnClickListener {
            defaultOptionView()
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionMathematics.setOnClickListener {
            defaultOptionView()
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionGk.setOnClickListener {
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