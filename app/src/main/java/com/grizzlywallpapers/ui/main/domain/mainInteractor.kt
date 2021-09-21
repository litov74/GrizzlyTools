package com.grizzlywallpapers.ui.main.domain

import com.grizzlywallpapers.common.base.BaseInteractor
import com.grizzlywallpapers.db.SharedPreferencesProvider
import com.grizzlywallpapers.ui.main.presentation.mainPresenter
import io.reactivex.rxjava3.disposables.CompositeDisposable

interface mainInteractor : BaseInteractor{

}



class mainInteractorImpl(private val presenter: mainPresenter) : mainInteractor {

    private val compositeDisposable = CompositeDisposable()
    private val sharedPreferences = SharedPreferencesProvider(presenter.context).sharedPreferences



    override fun disposeRequests() {
        compositeDisposable.clear()
    }


}