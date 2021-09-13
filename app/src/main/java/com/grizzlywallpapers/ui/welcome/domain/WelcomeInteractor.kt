package com.grizzlywallpapers.wallpapersgrizzly.ui.welcome.domain

import com.grizzlywallpapers.wallpapersgrizzly.common.base.BaseInteractor
import com.grizzlywallpapers.wallpapersgrizzly.db.SharedPreferencesProvider
import com.grizzlywallpapers.wallpapersgrizzly.ui.welcome.presentation.WelcomePresenter

interface WelcomeInteractor : BaseInteractor{

}

class WelcomeInteractorImpl(presenter: WelcomePresenter) : WelcomeInteractor {
    private val sharedPreferences =
        SharedPreferencesProvider(presenter.context).sharedPreferences

    override fun disposeRequests() {

    }

}