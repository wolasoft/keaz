package com.wolasoft.keaz.ui.launch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.wolasoft.keaz.R
import com.wolasoft.keaz.databinding.FragmentLaunchBinding

class LaunchActivity : AppCompatActivity(), LaunchFragment.OnLaunchFragmentInteractionListener {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        navController = findNavController(R.id.fragment)
    }

    override fun onLoginClicked() {
        navController.navigate(R.id.actionLoginFragment)
    }

    override fun onSubscribeClicked() {
        navController.navigate(R.id.actionPlaceHolder)
    }
}
