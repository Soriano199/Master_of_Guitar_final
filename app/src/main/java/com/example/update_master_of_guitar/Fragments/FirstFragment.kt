package com.example.update_master_of_guitar.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.update_master_of_guitar.R
import com.example.update_master_of_guitar.databinding.FragmentFirstBinding
import androidx.lifecycle.Lifecycle

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        (activity as AppCompatActivity).supportActionBar?.title =getString(R.string.app_name)

        binding.btnLogin.setOnClickListener {
            val nombre = binding.eTnombre.text.toString()

            // Create a bundle to pass the name as an argument
            val bundle = Bundle()
            bundle.putString("nombre", nombre)

            // Navigate to the second fragment with the bundle
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }

        // Configurar el menú
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.options_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
/**
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_menu -> {
                findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
                true
            }
            R.id.rules_menu -> {
                findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }*/
}
