package com.grizzlywallpapers.ui.slider.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.grizzlywallpapers.wallpapersgrizzly.R
import com.grizzlywallpapers.wallpapersgrizzly.databinding.FragmentSliderBinding
import moxy.MvpAppCompatFragment
import moxy.MvpView
import moxy.ktx.moxyPresenter
import moxy.viewstate.strategy.alias.AddToEnd

interface SliderView: MvpView{

    @AddToEnd
    fun showPreview()

    @AddToEnd
    fun showError(msg: String)

    @AddToEnd
    fun setLoading()

    @AddToEnd
    fun showNext() // TODO: remove if useless (currently not sure if I need it)

    @AddToEnd
    fun showFull()


}



class FragmentSlider() : MvpAppCompatFragment(), SliderView {

    private val presenter by moxyPresenter {
        SliderPresenter(context ?: requireActivity().applicationContext)
    }

    private var _binding: FragmentSliderBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSliderBinding.inflate(inflater, container, false)

        //binding.sliderViewPager2
        return binding.root
    }

    override fun showPreview() {
        TODO("Not yet implemented")
    }

    override fun showError(msg: String) {
        TODO("Not yet implemented")
    }

    override fun setLoading() {
        TODO("Not yet implemented")
    }

    override fun showNext() {
        TODO("Not yet implemented")
    }

    override fun showFull() {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }
}