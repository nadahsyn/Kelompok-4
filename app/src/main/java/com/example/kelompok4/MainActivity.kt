package com.example.kelompok4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.*
import com.example.kelompok4.ui.theme.Kelompok4Theme
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kelompok4.ui.screens.ProfileScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Kelompok4Theme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "login"
                ) {

                    composable("login") {
                        LoginScreen(navController)
                    }

                    composable("register") {
                        RegisterScreen(navController)
                    }

                    composable("profile") {
                        ProfileScreen(navController)
                    }

                    composable("avatar") {
                        AvatarScreen()
                    }
                }
            }
        }
    }
}
