package com.example.kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin.ui.theme.KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // এটি স্ট্যাটাস বারকে স্ক্রিনের সাথে মিশিয়ে দেয় (Edge-to-Edge)
        enableEdgeToEdge()

        setContent {
            // ১. আপনার প্রজেক্টের থিম ব্যবহার করা হচ্ছে
            KotlinTheme {
                // ২. Scaffold হলো একটি বেসিক স্ট্রাকচার (যেমন ফ্লাটারে Scaffold)
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // innerPadding ব্যবহার করে আমরা কন্টেন্টকে প্যাডিং দিচ্ছি
                    CounterScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }

        val name = "Kotlin Developer"
        println("Hello, $name") // এটি Logcat-এ দেখা যাবে
    }
}

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    // ৩. স্টেট ডিক্লেয়ার করা (count বাড়বে-কমবে)
    var count by remember { mutableIntStateOf(0) }
    val context = LocalContext.current

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to Jetpack Compose!",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Count is: $count",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // ৪. বাটন যোগ করা
        Button(onClick = {
            count++ // স্টেট আপডেট করা
            if (count % 5 == 0) {
                Toast.makeText(context, "Nice! You reached $count", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text(text = "Click to Increment")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KotlinTheme {
        CounterScreen()
    }
}