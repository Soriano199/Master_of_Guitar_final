package com.example.update_master_of_guitar.Fragments
import android.content.Context
import android.content.Intent
import android.net.MailTo
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.TextView

import androidx.fragment.app.Fragment
import com.example.update_master_of_guitar.R
import com.example.update_master_of_guitar.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {
    private lateinit var binding: FragmentThirdBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)

        // Recoger el nombre de la aplicación del argumento
        val nombreUsuario = arguments?.getString("nombre")
        // Crear la cadena del saludo
        binding.tvMessage.text = getString(R.string.info, nombreUsuario)

        // Configurar el botón de contacto
        binding.Contactar.setOnClickListener {
            enviarCorreoConsulta(nombreUsuario)
        }
    }

    private fun enviarCorreoConsulta(nombreApp: String?) {
        val direccionCorreo = "jsormar@g.educaand.es"
        val asunto = "Consulta de la app $nombreApp"

        // Crear un intent implícito para enviar correo electrónico
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$direccionCorreo")
            putExtra(Intent.EXTRA_SUBJECT, asunto)
        }
        startActivity(intent)
    }
}

