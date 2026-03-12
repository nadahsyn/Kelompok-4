package com.example.kelompok4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.ui.draw.scale
@Composable
fun AvatarScreen() {

    var showHair by remember { mutableStateOf(true) }
    var showBrow by remember { mutableStateOf(true) }
    var showEye by remember { mutableStateOf(true) }
    var showNose by remember { mutableStateOf(true) }
    var showMouth by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFE3EA)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE91E63))
                .padding(16.dp)
        ) {
            Text(
                text = "AvatarApp",
                color = Color.White,
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier.size(450.dp),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(R.drawable.ava),
                contentDescription = null,
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )

            if (showEye) {
                Image(
                    painter = painterResource(R.drawable.eyes),
                    contentDescription = null,
                    modifier = Modifier
                        .matchParentSize()
                        .offset(y = (39).dp)
                        .scale(1.15f),
                    contentScale = ContentScale.Crop
                )
            }

            if (showBrow) {
                Image(
                    painter = painterResource(R.drawable.brow),
                    contentDescription = null,
                    modifier = Modifier
                        .matchParentSize()
                        .offset(y = (35).dp)
                        .scale(1.15f),
                    contentScale = ContentScale.Crop
                )
            }

            if (showNose) {
                Image(
                    painter = painterResource(R.drawable.nose),
                    contentDescription = null,
                    modifier = Modifier
                        .matchParentSize()
                        .offset(y = 40.dp)
                        .scale(1.15f),
                    contentScale = ContentScale.Crop
                )
            }

            if (showMouth) {
                Image(
                    painter = painterResource(R.drawable.mouth),
                    contentDescription = null,
                    modifier = Modifier
                        .matchParentSize()
                        .offset(y = 48.dp)
                        .scale(1.15f),
                    contentScale = ContentScale.Crop
                )
            }

            if (showHair) {
                Image(
                    painter = painterResource(R.drawable.hair),
                    contentDescription = null,
                    modifier = Modifier
                        .matchParentSize()
                        .offset(y = 35.dp)
                        .scale(1.15f),
                    contentScale = ContentScale.Crop
                )
            }
        }

        Spacer(modifier = Modifier.height(60.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = showHair,
                    onCheckedChange = { showHair = it }
                )
                Text("Hair")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = showBrow,
                    onCheckedChange = { showBrow = it }
                )
                Text("Brow")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = showEye,
                    onCheckedChange = { showEye = it }
                )
                Text("Eye")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = showNose,
                    onCheckedChange = { showNose = it }
                )
                Text("Nose")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = showMouth,
                    onCheckedChange = { showMouth = it }
                )
                Text("Mouth")
            }
        }
    }
}