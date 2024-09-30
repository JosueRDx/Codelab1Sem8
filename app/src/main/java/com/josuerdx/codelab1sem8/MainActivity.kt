package com.josuerdx.codelab1sem8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.josuerdx.codelab1sem8.ui.theme.Codelab1Sem8Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            Codelab1Sem8Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    InventoryApp()
                }
            }
        }
    }
}

