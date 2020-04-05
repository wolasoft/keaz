package com.wolasoft.keaz.ui.launch

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.wolasoft.keaz.R
import com.wolasoft.keaz.databinding.ActivityLaunchBinding

class LaunchActivity : AppCompatActivity(), LaunchFragment.OnLaunchFragmentInteractionListener {
    private lateinit var navController: NavController
    private lateinit var dataBinding: ActivityLaunchBinding
    private lateinit var appBarConfiguration : AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_launch)
        dataBinding.toolbar.visibility = View.GONE
        setSupportActionBar(dataBinding.toolbar)
        dataBinding.toolbar.title = ""
        navController = findNavController(R.id.fragment)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        dataBinding.toolbar.visibility = View.GONE
        return navController.navigateUp()
    }

    override fun onLoginClicked() {
        navController.navigate(R.id.loginFragment)
        dataBinding.toolbar.visibility = View.VISIBLE
        dataBinding.toolbar.title = ""
    }

    override fun onSubscribeClicked() {
        navController.navigate(R.id.subscribeFragment)
        dataBinding.toolbar.visibility = View.VISIBLE
        dataBinding.toolbar.title = ""
    }
}
