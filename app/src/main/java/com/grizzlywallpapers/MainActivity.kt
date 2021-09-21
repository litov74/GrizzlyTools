package com.grizzlywallpapers

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.grizzlywallpapers.common.Constants.yandexApi
import com.grizzlywallpapers.wallpapersgrizzly.R
import com.grizzlywallpapers.ui.welcome.presentation.WelcomeActivity
import moxy.MvpAppCompatActivity
import com.yandex.metrica.YandexMetrica

import com.yandex.metrica.YandexMetricaConfig


class MainActivity : MvpAppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Creating an extended library configuration.
        val config = YandexMetricaConfig.newConfigBuilder(yandexApi).build()
        //// Initializing the AppMetrica SDK.
        YandexMetrica.activate(applicationContext, config)
        //// Automatic tracking of user activity.
        YandexMetrica.enableActivityAutoTracking(this.application)
        setContentView(R.layout.activity_splash)
        // NAVIGATION
        // TODO: move this to another activity or it will cause failure on launch

        sharedPreferences = getSharedPreferences(SP_KEY_ACCOUNT, Context.MODE_PRIVATE)





        startMainActivity() //TODO: to be edited later

    }

    private fun startMainActivity() {


        mRunnable = Runnable {
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish()
        }

        mHandler = Handler()

        mHandler.postDelayed(mRunnable, 4000)
    }


    companion object {
        const val SP_KEY_ACCOUNT = "account"
        const val SP_KEY_FIRST_INIT = "firstInit"
        const val SP_KEY_WAS_TUTORIAL = "wasTutorial"
    }
}