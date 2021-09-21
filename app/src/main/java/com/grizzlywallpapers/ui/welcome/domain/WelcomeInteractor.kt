package com.grizzlywallpapers.ui.welcome.domain

import com.grizzlywallpapers.common.base.BaseInteractor
import com.grizzlywallpapers.db.SharedPreferencesProvider
import com.grizzlywallpapers.ui.welcome.presentation.WelcomePresenter

interface WelcomeInteractor : BaseInteractor {

}

class WelcomeInteractorImpl(presenter: WelcomePresenter) : WelcomeInteractor {
    private val sharedPreferences =
        SharedPreferencesProvider(presenter.context).sharedPreferences

    override fun disposeRequests() {

    }

}