package com.example.robbyallen.kotlinfragments

import kotlinx.android.synthetic.main.fragment_input.*
import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by robbyallen on 5/3/17.
 */

class InputFragment : Fragment() {

    var ifListener : InputFragmentListener? = null

    interface InputFragmentListener {
        fun submitInput(value: String)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        ifListener = context as? InputFragmentListener
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener { v -> buttonClicked(v) }
    }

    fun buttonClicked(v: View) {
        if (ifListener == null) return
        ifListener!!.submitInput(textField!!.text.toString())
    }
}
