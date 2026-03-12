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
import androidx.compose.foundation.clickable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.ui.draw.scale
import com.example.kelompok4.R

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

        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(BubblegumPink)
                .clickable {
                    navController.navigate("avatar")
                },
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            ) {

                Image(
                    painter = painterResource(R.drawable.ava),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

                Image(
                    painter = painterResource(R.drawable.eyes),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = 10.dp)
                        .scale(1.1f),
                    contentScale = ContentScale.Crop
                )

                Image(
                    painter = painterResource(R.drawable.brow),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = 8.dp)
                        .scale(1.1f),
                    contentScale = ContentScale.Crop
                )

                Image(
                    painter = painterResource(R.drawable.nose),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = 12.dp)
                        .scale(1.1f),
                    contentScale = ContentScale.Crop
                )

                Image(
                    painter = painterResource(R.drawable.mouth),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = 16.dp)
                        .scale(1.1f),
                    contentScale = ContentScale.Crop
                )

                Image(
                    painter = painterResource(R.drawable.hair),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = 8.dp)
                        .scale(1.1f),
                    contentScale = ContentScale.Crop
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Intan Vilodia Putri",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = HumblePink
        )

        Text(
            text = "intanvilo@gmail.com",
            fontSize = 16.sp,
            color = InLove
        )

        Spacer(modifier = Modifier.height(40.dp))

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
