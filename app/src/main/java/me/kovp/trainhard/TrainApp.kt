package me.kovp.trainhard

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class TrainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initLogging()
        initDi()
    }

    private fun initLogging() {
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }

    private fun initDi() {
        startKoin {
            androidContext(this@TrainApp)
            modules(

            )
        }
    }
}