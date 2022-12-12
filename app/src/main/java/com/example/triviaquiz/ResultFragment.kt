package com.example.triviaquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.triviaquiz.databinding.FragmentCategoryBinding
import com.example.triviaquiz.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    lateinit var binding: FragmentResultBinding
    private val args: ResultFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(layoutInflater,container,false)
        val correctAnswers = args.myargs
        binding.tvCorrectAnswers.text = "Score: $correctAnswers"
        binding.btHome.setOnClickListener{
            findNavController().navigate(R.id.action_resultFragment_to_homeFragment)
        }
        return binding.root
    }

}