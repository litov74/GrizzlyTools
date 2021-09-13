package com.grizzlywallpapers.wallpapersgrizzly

import android.content.Context
import androidx.startup.AppInitializer
import androidx.multidex.MultiDexApplication
import net.danlew.android.joda.JodaTimeInitializer

class GrizzlyApp : MultiDexApplication() {

    init {
        instance = this
    }

    var context: Context = this

    companion object {

        private var instance: GrizzlyApp? = null

        fun applicationContext() : Context{
            return instance!!.applicationContext
        }

    }

    override fun onCreate() {
        super.onCreate()

        val context: Context = GrizzlyApp.applicationContext()
        AppInitializer.getInstance(this).initializeComponent(
            JodaTimeInitializer::class.java
        )
    }

}