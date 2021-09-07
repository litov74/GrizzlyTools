package com.litov74.grizzlytools.ui.welcome.presentation

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import com.litov74.grizzlytools.MainActivity
import com.litov74.grizzlytools.databinding.ActivityWelcomeBinding
import moxy.MvpAppCompatActivity
import moxy.MvpView
import moxy.ktx.moxyPresenter
import moxy.viewstate.strategy.alias.AddToEnd

interface WelcomeView : MvpView{

    @AddToEnd
    fun finishActivity()

}




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