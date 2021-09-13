package com.grizzlywallpapers.wallpapersgrizzly.ui.welcome.presentation

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import com.grizzlywallpapers.wallpapersgrizzly.MainActivity
import com.grizzlywallpapers.wallpapersgrizzly.databinding.ActivityWelcomeBinding
import moxy.MvpAppCompatActivity
import moxy.MvpView
import moxy.ktx.moxyPresenter
import moxy.viewstate.strategy.alias.AddToEnd

interface WelcomeView : MvpView{

    @AddToEnd
    fun finishActivity()

}

// it is okay to see here import error, just ignore it


class WelcomeActivity : MvpAppCompatActivity(), WelcomeView {

    private val presenter by moxyPresenter { WelcomePresenter(this) }

    private var _binding: ActivityWelcomeBinding?=null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityWelcomeBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.activityWelcomeContinueBtn.setOnClickListener { presenter.onContinueButtonClicked() }
    }

    override fun finishActivity() {
        runOnUiThread {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

}