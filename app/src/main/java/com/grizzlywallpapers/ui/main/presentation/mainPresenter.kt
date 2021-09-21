package com.grizzlywallpapers.ui.main.presentation

import android.content.Context
import com.grizzlywallpapers.ui.main.domain.mainInteractor
import com.grizzlywallpapers.ui.main.domain.mainInteractorImpl
import moxy.MvpPresenter

class mainPresenter(val context: Context) : MvpPresenter<MainView>() {

    private val interactor: mainInteractor = mainInteractorImpl(this)




}