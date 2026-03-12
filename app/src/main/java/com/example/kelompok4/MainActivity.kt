package com.example.kelompok4

import AppNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.kelompok4.ui.theme.Kelompok4Theme
import androidx.navigation.compose.rememberNavController
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Kelompok4Theme {
                RegisterScreen()
            }
            val navController = rememberNavController()
            AppNavigation(navController)
        }
    }
}