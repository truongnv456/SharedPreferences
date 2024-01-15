package navigationcomponentturtorialcom.example.sharedpreferences

import android.app.Application

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        DataLocalManager.init(applicationContext)
    }
}