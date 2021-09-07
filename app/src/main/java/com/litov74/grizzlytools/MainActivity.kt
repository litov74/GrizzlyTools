package com.litov74.grizzlytools

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.litov74.grizzlytools.common.Constants.yandexApi
import moxy.MvpAppCompatActivity
import java.net.URL
import com.yandex.metrica.YandexMetrica

import com.yandex.metrica.YandexMetricaConfig




class MainActivity : MvpAppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Creating an extended library configuration.
        // Creating an extended library configuration.
        //val config = YandexMetricaConfig.newConfigBuilder(yandexApi).build()
        //// Initializing the AppMetrica SDK.
        //// Initializing the AppMetrica SDK.
        //YandexMetrica.activate(applicationContext, config)
        //// Automatic tracking of user activity.
        //// Automatic tracking of user activity.
        //YandexMetrica.enableActivityAutoTracking(this.application)
        setContentView(R.layout.activity_splash)
        sharedPreferences = getSharedPreferences(SP_KEY_ACCOUNT, Context.MODE_PRIVATE)


    }


    private fun startMainActivity() {


        mRunnable = Runnable {
            startActivity(Intent(this, MainActivity::class.java))
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