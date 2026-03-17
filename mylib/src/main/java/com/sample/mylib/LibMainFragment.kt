package com.sample.mylib

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class LibMainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lib_main, container, false)
        view.findViewById<View>(R.id.libButton).setOnClickListener {
            Toast.makeText(context, "Kütüphane içinden merhaba!", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}