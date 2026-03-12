package com.example.kelompok4

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.kelompok4.ui.theme.*

@Composable
fun LoginScreen(navController: NavController) {

    val context = LocalContext.current
    val keyboardController = LocalSoftwareKeyboardController.current

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AlmostPink)
            .pointerInput(Unit) {
                detectTapGestures { keyboardController?.hide() }
            }
            .padding(24.dp)
            .imePadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Welcome Back",
            fontSize = 30.sp,
            color = HumblePink
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Login to your account",
            color = InLove
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            singleLine = true,
            leadingIcon = { Icon(Icons.Default.Person, null) },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = StrawberryMilkshake,
                unfocusedContainerColor = StrawberryMilkshake,
                focusedBorderColor = BubblegumPink,
                unfocusedBorderColor = BubblegumPink
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            singleLine = true,
            visualTransformation =
                if (passwordVisible) VisualTransformation.None
                else PasswordVisualTransformation(),
            leadingIcon = { Icon(Icons.Default.Lock, null) },
            trailingIcon = {

                val image =
                    if (passwordVisible)
                        Icons.Default.Visibility
                    else
                        Icons.Default.VisibilityOff

                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(image, null)
                }
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = StrawberryMilkshake,
                unfocusedContainerColor = StrawberryMilkshake,
                focusedBorderColor = BubblegumPink,
                unfocusedBorderColor = BubblegumPink
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = {

                keyboardController?.hide()

                if (username.isEmpty() || password.isEmpty()) {

                    Toast.makeText(
                        context,
                        "Username dan Password harus diisi",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {

                    Toast.makeText(
                        context,
                        "Login berhasil",
                        Toast.LENGTH_SHORT
                    ).show()

                    navController.navigate("profile")
                }
            },
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BubblegumPink,
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Lupa Password?",
            color = InLove,
            modifier = Modifier.clickable {
                Toast.makeText(context, "Fitur belum tersedia", Toast.LENGTH_SHORT).show()
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(
            onClick = { navController.navigate("register") }
        ) {
            Text(
                text = "Belum punya akun? Register",
                color = HumblePink
            )
        }
    }
}
