package com.grizzlywallpapers.wallpapersgrizzly.ui.welcome.presentation

import android.content.Context
import com.grizzlywallpapers.wallpapersgrizzly.common.base.BasePresenter
import com.grizzlywallpapers.wallpapersgrizzly.ui.welcome.domain.WelcomeInteractor
import com.grizzlywallpapers.wallpapersgrizzly.ui.welcome.domain.WelcomeInteractorImpl
import moxy.MvpPresenter

class WelcomePresenter(val context: Context) : MvpPresenter<WelcomeView>(), BasePresenter {

    private val interactor: WelcomeInteractor = WelcomeInteractorImpl(this)
    override fun onDestroyCalled() {}

    fun onContinueButtonClicked(){
        //TODO: add click listener
    }


}