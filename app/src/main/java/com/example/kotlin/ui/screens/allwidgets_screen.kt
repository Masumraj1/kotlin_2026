package com.example.kotlin.ui.screens

//package com.example.kotlin.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin.R // আপনার প্রজেক্টের রিসোর্স ইম্পোর্ট

@Composable
fun AllWidgetsScreen(modifier: Modifier = Modifier) {
    // স্টেট হ্যান্ডেল করার জন্য
    var textInput by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    // স্ক্রল করার জন্য scrollState
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState), // ফ্লাটারের SingleChildScrollView এর মতো
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // ১. টেক্সট উইজেট
        Text(text = "সব উইজেট একসাথে", fontSize = 24.sp, style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        // ২. কার্ড উইজেট (ফ্লাটারের Card এর মতো)
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "এটি একটি কার্ড উইজেট", style = MaterialTheme.typography.titleMedium)
                Text(text = "এর ভেতরে আপনি যা খুশি রাখতে পারেন।")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // ৩. ইনপুট বক্স (ফ্লাটারের TextField এর মতো)
        OutlinedTextField(
            value = textInput,
            onValueChange = { textInput = it },
            label = { Text("আপনার নাম লিখুন") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        // ৪. রো (Row) উইজেট (পাশাপাশি রাখার জন্য)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "আপনি কি একমত?")
//            Checkbox(
//                checked = isChecked,
//                onValueChange = { isChecked = it }
//            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // ৫. ইমেজ উইজেট (drawable ফোল্ডারে একটি ছবি থাকলে এটি কাজ করবে)
        // Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Logo")

        Spacer(modifier = Modifier.height(20.dp))

        // ৬. বাটন (Button)
        Button(
            onClick = { /* কিছু একটা হবে */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "সাবমিট করুন")
        }
    }
}