package com.example.triviaquiz

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.triviaquiz.databinding.FragmentDifficultyBinding
import java.lang.ProcessBuilder.Redirect.to

class DifficultyFragment : Fragment() {
    lateinit var binding: FragmentDifficultyBinding
    private val options = ArrayList<TextView>()
    private var mSelectedOption: String = ""
    private val myArgs: DifficultyFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding = FragmentDifficultyBinding.inflate(layoutInflater,container,false)
        options.add(0,binding.tvOptionEasy)
        options.add(1,binding.tvOptionMedium)
        options.add(2,binding.tvOptionHard)
        binding.btDone.setOnClickListener{
            if(mSelectedOption == ""){
//                Toast.makeText(context,"Select any Difficulty", Toast.LENGTH_SHORT).show()
            }
            else {
                val action = DifficultyFragmentDirections.actionDifficultyFragmentToQuizFragment(category = myArgs.category, mSelectedOption)
                findNavController().navigate(action)
            }
        }
        binding.tvOptionEasy.setOnClickListener{
            defaultOptionView()
            mSelectedOption = "easy"
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionMedium.setOnClickListener{
            defaultOptionView()
            mSelectedOption = "medium"
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        binding.tvOptionHard.setOnClickListener {
            defaultOptionView()
            mSelectedOption = "hard"
            it.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.selected_option_border
            )
        }
        return binding.root
    }
    fun defaultOptionView(){
        mSelectedOption = ""
        for(option in options){
            option.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.default_option_border
            )
        }
    }
}