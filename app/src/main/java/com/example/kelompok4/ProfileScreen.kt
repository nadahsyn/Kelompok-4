package com.example.kelompok4.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kelompok4.ui.theme.*
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.navigation.NavController

@Composable
fun ProfileScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AlmostPink)
            .padding(24.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(40.dp))

        //PROFILE IMAGE
        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(BubblegumPink)
        )

        Spacer(modifier = Modifier.height(16.dp))

        //USERNAME
        Text(
            text = "Intan Vilodia Putri",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = HumblePink
        )

        //EMAIL
        Text(
            text = "intanvilo@gmail.com",
            fontSize = 16.sp,
            color = InLove
        )

        Spacer(modifier = Modifier.height(40.dp))

        //USER INFO CARD
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = StrawberryMilkshake)
        ) {

            Column(modifier = Modifier.padding(20.dp)) {

                Text("Nama", fontWeight = FontWeight.Bold, color = HumblePink)
                Text("Intan Vilodia Putri", color = HumblePink)

                Spacer(modifier = Modifier.height(12.dp))

                Text("NIM", fontWeight = FontWeight.Bold, color = HumblePink)
                Text("245150701111003", color = HumblePink)

                Spacer(modifier = Modifier.height(12.dp))

                Text("Program Studi", fontWeight = FontWeight.Bold, color = HumblePink)
                Text("Teknologi Informasi", color = HumblePink)

            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        //LOGOUT BUTTON
        Button(
            onClick = {
                navController.navigate("login")
            },
            colors = ButtonDefaults.buttonColors(containerColor = InLove),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Logout",
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}