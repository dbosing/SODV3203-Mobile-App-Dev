package com.example.mathgameapp.logic.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mathgameapp.logic.GameViewModel

@Composable
fun StartScreen(navController: NavController, viewModel: GameViewModel) {
    var questionCount by remember { mutableStateOf("5") } // User input for number of questions

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Enter number of questions:")
        TextField(
            value = questionCount,
            onValueChange = { questionCount = it }, // Update input value
            modifier = Modifier.padding(16.dp)
        )
        Button(onClick = {
            viewModel.generateQuestions(questionCount.toIntOrNull() ?: 5) // Generate questions
            navController.navigate("question") // Navigate to question screen
        }) {
            Text("Start Game")
        }
    }
}