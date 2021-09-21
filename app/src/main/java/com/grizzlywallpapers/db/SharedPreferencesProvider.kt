package com.grizzlywallpapers.db

import android.content.Context
import com.grizzlywallpapers.MainActivity.Companion.SP_KEY_ACCOUNT

open class SharedPreferencesProvider(context: Context) {

    open val sharedPreferences =
        context.getSharedPreferences(SP_KEY_ACCOUNT, Context.MODE_PRIVATE)

}