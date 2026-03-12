import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.navigation.NavHostController
import com.example.kelompok4.LoginScreen
import com.example.kelompok4.ui.screens.ProfileScreen

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(navController, startDestination = "login"){

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
            AvatarScreen(navController)
        }
    }
}

@Composable
fun AvatarScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun RegisterScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}