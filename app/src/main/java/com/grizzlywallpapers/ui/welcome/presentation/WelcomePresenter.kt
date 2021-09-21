package com.grizzlywallpapers.ui.welcome.presentation

import android.content.Context
import com.grizzlywallpapers.common.base.BasePresenter
import com.grizzlywallpapers.ui.welcome.domain.WelcomeInteractor
import com.grizzlywallpapers.ui.welcome.domain.WelcomeInteractorImpl
import com.grizzlywallpapers.ui.welcome.presentation.WelcomeView
import moxy.MvpPresenter

class WelcomePresenter(val context: Context) : MvpPresenter<WelcomeView>(), BasePresenter {

    private val interactor: WelcomeInteractor = WelcomeInteractorImpl(this)
    override fun onDestroyCalled() {}

    fun onContinueButtonClicked(){
        runMainActivity()
    }

    private fun runMainActivity(){
        //interactor.disposeRequests()
        viewState.finishActivity()
    }


}