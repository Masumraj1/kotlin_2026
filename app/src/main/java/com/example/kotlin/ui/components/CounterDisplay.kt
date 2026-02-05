package com.example.kotlin.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun CounterDisplay(count: Int) {
    Text(
        text = "Count is: $count",
        fontSize = 40.sp
    )
}