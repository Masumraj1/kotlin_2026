package com.example.kotlin.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin.R // আপনার প্রজেক্টের প্যাকেজ নাম অনুযায়ী

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    var isNotificationsEnabled by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally // এখানে Alignment এখন সঠিক
    ) {
        // ১. Box এবং Image
        Box(contentAlignment = Alignment.BottomEnd) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Profile Pic",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            // IconButton: এডিট আইকন
            IconButton(onClick = { /* Edit Action */ }) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = null,
                    tint = Color.Blue
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // ২. Text এবং Divider
        Text(
            text = "Anisul Islam",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp)) // Material3 তে HorizontalDivider ব্যবহার করা ভালো

        // ৩. Card এবং Row
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Enable Notifications")

                Checkbox(
                    checked = isNotificationsEnabled,
                    onCheckedChange = { newValue ->
                        isNotificationsEnabled = newValue
                    }
                )
            }
        }
    }
}