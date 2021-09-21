package com.grizzlywallpapers.ui.main.presentation

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.grizzlywallpapers.wallpapersgrizzly.R
import com.grizzlywallpapers.wallpapersgrizzly.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.MvpView
import moxy.ktx.moxyPresenter
import moxy.viewstate.strategy.alias.AddToEnd

interface MainView : MvpView {

    @AddToEnd
    fun setLoading(by: Boolean)

    @AddToEnd
    fun showError(msg: String)

}


interface MainActivityView{

    fun loadImages()

    fun setAsWallpaper()

    fun playSound()

}


class mainActivity: MvpAppCompatActivity(), MainView, MainActivityView {


    private val presenter by moxyPresenter { mainPresenter(this) }

    private var _binding: ActivityMainBinding? = null

    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navController = findNavController(R.id.nav_host_fragment_container)
        bottomNavigationView.setupWithNavController(navController)

    }

    override fun setLoading(by: Boolean) {
        runOnUiThread{
            if(by){
                // TODO: add loading here
            }else{

            }
        }
    }

    override fun showError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun loadImages() {

    }

    override fun setAsWallpaper() {

    }

    override fun playSound() {

    }

}