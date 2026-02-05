package com.example.kotlin.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin.ui.components.ActionButton
import com.example.kotlin.ui.components.CounterDisplay
@Composable
fun MainCounterScreen(modifier: Modifier = Modifier) {
    // স্টেট ম্যানেজমেন্ট
    var count by remember { mutableIntStateOf(0) }
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello Mac User! ", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(20.dp))

        // আমাদের তৈরি করা কম্পোনেন্ট কল করা
        CounterDisplay(count = count)

        Spacer(modifier = Modifier.height(20.dp))

        // আমাদের তৈরি করা বাটন কল করা
        ActionButton(label = "Increase Count") {
            count++
            if (count % 5 == 0) {
                Toast.makeText(context, "Great! $count clicks!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}