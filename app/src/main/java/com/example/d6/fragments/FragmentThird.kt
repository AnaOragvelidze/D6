package com.example.d6.fragments

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.d6.R

class FragmentThird: Fragment(R.layout.fragment_third) {
    private lateinit var editTextNote: EditText
    private lateinit var textNote: TextView
    private lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}