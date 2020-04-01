package com.wolasoft.keaz.ui.operations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.wolasoft.keaz.R

class OperationsFragment : Fragment() {

    private lateinit var operationsViewModel: OperationsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        operationsViewModel =
                ViewModelProviders.of(this).get(OperationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_operations, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        operationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
