package com.grizzlywallpapers.ui.slider.domain

import com.grizzlywallpapers.common.base.BaseInteractor
import com.grizzlywallpapers.db.SharedPreferencesProvider
import com.grizzlywallpapers.ui.slider.presentation.SliderPresenter
import io.reactivex.rxjava3.disposables.CompositeDisposable


interface SliderInteractor : BaseInteractor{

    fun getVideoContent()
    fun getImagePreview()

}



class SliderInteractorImpl(private val presenter: SliderPresenter) : SliderInteractor {

    private val compositeDisposable = CompositeDisposable()
    private val sharedPreferences = SharedPreferencesProvider(presenter.context).sharedPreferences

    override fun getVideoContent() {

    }

    override fun getImagePreview() {

    }

    override fun disposeRequests() {
        compositeDisposable.clear()
    }
}