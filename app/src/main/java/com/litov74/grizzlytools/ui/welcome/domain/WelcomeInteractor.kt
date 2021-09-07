package com.litov74.grizzlytools.ui.welcome.domain

import com.litov74.grizzlytools.common.base.BaseInteractor
import com.litov74.grizzlytools.db.SharedPreferencesProvider
import com.litov74.grizzlytools.ui.welcome.presentation.WelcomePresenter

interface WelcomeInteractor : BaseInteractor{

}

class WelcomeInteractorImpl(presenter: WelcomePresenter) : WelcomeInteractor {
    private val sharedPreferences =
        SharedPreferencesProvider(presenter.context).sharedPreferences

    override fun disposeRequests() {

    }

}