package com.litov74.grizzlytools.ui.welcome.presentation

import android.content.Context
import com.litov74.grizzlytools.common.base.BasePresenter
import com.litov74.grizzlytools.ui.welcome.domain.WelcomeInteractor
import com.litov74.grizzlytools.ui.welcome.domain.WelcomeInteractorImpl
import moxy.MvpPresenter

class WelcomePresenter(val context: Context) : MvpPresenter<WelcomeView>(), BasePresenter {

    private val interactor: WelcomeInteractor = WelcomeInteractorImpl(this)
    override fun onDestroyCalled() {}

    fun onContinueButtonClicked(){
        //TODO: add click listener
    }


}