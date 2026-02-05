package com.example.kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.kotlin.ui.screens.AllWidgetsScreen
// আপনার তৈরি করা নতুন স্ক্রিনটি এখানে ইম্পোর্ট হবে
import com.example.kotlin.ui.screens.MainCounterScreen
import com.example.kotlin.ui.theme.KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            KotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // এখানে এখন আর কোনো লজিক বা বড় কোড নেই
                    AllWidgetsScreen(modifier = Modifier.padding(innerPadding))
                    // সরাসরি অন্য ফাইল থেকে আসা স্ক্রিনকে কল করা হচ্ছে
//                    MainCounterScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}