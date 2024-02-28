package com.example.update_master_of_guitar.Fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejemplo_recyclerview.Adapter.GuitarraAdapter
import com.example.update_master_of_guitar.GuitarristasProvider
import com.example.update_master_of_guitar.R
import com.example.update_master_of_guitar.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        iniciarRecyclerView()
        /*binding.btnCredit.setOnClickListener {
            val nombre = requireArguments().getString("nombre")
            val action = R.id.action_secondFragment_to_thirdFragment
            val bundle = Bundle()
            bundle.putString("nombre", nombre)
            view.findNavController().navigate(action, bundle)
        }*/
    }


    private fun iniciarRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.recyclerGuitarristas.layoutManager = manager
        binding.recyclerGuitarristas.adapter = GuitarraAdapter(GuitarristasProvider.listaGuitarristas)
    }
}

