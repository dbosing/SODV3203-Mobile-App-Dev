package com.example.mathgameapp.logic.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mathgameapp.logic.GameViewModel
import kotlinx.coroutines.delay

@Composable
fun QuestionScreen(navController: NavController, viewModel: GameViewModel) {
    val (num1, num2) = viewModel.getCurrentQuestion() // Get current question
    var answer by remember { mutableStateOf("") } // Store user input
    var timeLeft by remember { mutableStateOf(10) }  // Countdown timer (10 seconds)

    // Timer countdown logic using LaunchedEffect
    LaunchedEffect(timeLeft) {
        while (timeLeft > 0) {
            delay(1000) // Wait for 1 second
            timeLeft--
        }
        if (timeLeft == 0) { // If time runs out, count as wrong
            viewModel.wrongAnswers++
            if (viewModel.isGameOver()) {
                navController.navigate("result") // Go to results if game over
            } else {
                navController.navigate("question") // Load next question
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Correct: ${viewModel.correctAnswers} | Wrong: ${viewModel.wrongAnswers}")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Time left: $timeLeft")
        Text("What is $num1 + $num2?")
        TextField(
            value = answer,
            onValueChange = { answer = it }, // Capture user input
            modifier = Modifier.padding(16.dp)
        )
        Row {
            Button(onClick = {
                viewModel.checkAnswer(answer)
                if (viewModel.isGameOver()) {
                    navController.navigate("result") {
                        popUpTo("start") { inclusive = true }
                    }
                } else {
                    navController.navigate("question") // Load next question
                }
            }) {
                Text("Next")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { navController.navigate("start") }) {
                Text("Cancel")
            }
        }
    }
}