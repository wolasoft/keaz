package com.wolasoft.keaz.ui.launch

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.wolasoft.keaz.R
import com.wolasoft.keaz.databinding.FragmentLaunchBinding

class LaunchFragment : Fragment() {
    private lateinit var dataBinding: FragmentLaunchBinding
    private var listener: OnLaunchFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_launch, container, false)
        dataBinding.loginBT.setOnClickListener {
            listener?.onLoginClicked()
        }
        dataBinding.subscribeBT.setOnClickListener {
            listener?.onSubscribeClicked()
        }
        return dataBinding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnLaunchFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString()
                    + " must implement OnLaunchFragmentInteractionListener");
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnLaunchFragmentInteractionListener {
        fun onLoginClicked()
        fun onSubscribeClicked()
    }
}