package com.litov74.grizzlytools.db

import android.content.Context
import com.litov74.grizzlytools.MainActivity.Companion.SP_KEY_ACCOUNT

open class SharedPreferencesProvider(context: Context) {

    open val sharedPreferences =
        context.getSharedPreferences(SP_KEY_ACCOUNT, Context.MODE_PRIVATE)

}