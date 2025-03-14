package com.example.mathgameapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mathgameapp.logic.GameViewModel
import com.example.mathgameapp.logic.screens.QuestionScreen
import com.example.mathgameapp.logic.screens.ResultScreen
import com.example.mathgameapp.logic.screens.StartScreen
import com.example.mathgameapp.ui.theme.MathGameAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MathGameAppTheme {
                val navController = rememberNavController()
                val gameViewModel: GameViewModel = viewModel()

                NavHost(navController = navController, startDestination = "start") {
                    composable("start") { StartScreen(navController, gameViewModel) }
                    composable("question") { QuestionScreen(navController, gameViewModel) }
                    composable("result") { ResultScreen(navController, gameViewModel) }
                }
            }
        }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun PreviewMathGameApp() {
    val navController = rememberNavController()
    val viewModel = GameViewModel()

    StartScreen(navController, viewModel)
}