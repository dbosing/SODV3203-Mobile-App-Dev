package com.example.mathgameapp.logic.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mathgameapp.logic.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Game Over!")
        Text("Correct: ${viewModel.correctAnswers}")
        Text("Wrong: ${viewModel.wrongAnswers}")
        Button(onClick = {
            viewModel.generateQuestions(5)
            navController.navigate("start") { popUpTo("start") { inclusive = true } } }) {
            Text("Play Again")
        }
    }
}