package com.example.kotlin.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onProfileClick: () -> Unit,
    onLoginClick: () -> Unit,
    onDataClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Main Menu", fontSize = 30.sp)

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = onProfileClick, modifier = Modifier.fillMaxWidth(0.8f)) {
            Text("Go to Profile")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onLoginClick, modifier = Modifier.fillMaxWidth(0.8f)) {
            Text("Go to Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onDataClick, modifier = Modifier.fillMaxWidth(0.8f)) {
            Text("Go to Data List")
        }
    }
}