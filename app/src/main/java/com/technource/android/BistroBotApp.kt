package com.technource.android

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BistroBotApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
