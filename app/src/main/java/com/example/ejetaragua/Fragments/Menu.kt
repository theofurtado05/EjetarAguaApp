package com.example.ejetaragua.Fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.ejetaragua.FormDiagnostico
import com.example.ejetaragua.MainActivity
import com.example.ejetaragua.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Menu.newInstance] factory method to
 * create an instance of this fragment.
 */
class Menu : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        val btInicio = view.findViewById<Button>(R.id.btInicio)
        val btDiagnostico = view.findViewById<Button>(R.id.btDiagnostico)

        btInicio.setOnClickListener {
            // Ao clicar em "Início", inicie a MainActivity
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }

        btDiagnostico.setOnClickListener {
            val intent = Intent(requireActivity(), FormDiagnostico::class.java)
            startActivity(intent)

        }

        return view
    }
}
