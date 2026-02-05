package com.example.kotlin.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DataListScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Contact List (LazyColumn)", fontSize = 20.sp)

        // ১. LazyColumn: ফ্লাটারের ListView.builder এর মতো
        LazyColumn(modifier = Modifier.weight(1f).fillMaxWidth()) {
            items(20) { index ->
                Card(modifier = Modifier.padding(vertical = 4.dp).fillMaxWidth()) {
                    Text(text = "User $index - Active Now", modifier = Modifier.padding(16.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text("Image Gallery (LazyVerticalGrid)", fontSize = 20.sp)

        // ২. LazyVerticalGrid: ফ্লাটারের GridView এর মতো
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.weight(1f).fillMaxWidth()
        ) {
            items(12) { index ->
                Card(modifier = Modifier.padding(4.dp).aspectRatio(1f)) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
                        Text("Img $index")
                    }
                }
            }
        }
    }
}