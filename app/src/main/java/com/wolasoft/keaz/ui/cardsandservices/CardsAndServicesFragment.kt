package com.wolasoft.keaz.ui.cardsandservices

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.wolasoft.keaz.R

class CardsAndServicesFragment : Fragment() {

    private lateinit var cardsAndServicesViewModel: CardsAndServicesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        cardsAndServicesViewModel =
                ViewModelProviders.of(this).get(CardsAndServicesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_cards_and_services, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        cardsAndServicesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
