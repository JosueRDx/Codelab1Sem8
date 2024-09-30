package com.josuerdx.codelab1sem8

import android.app.Application
import com.josuerdx.data.AppContainer
import com.josuerdx.data.AppDataContainer

class InventoryApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
