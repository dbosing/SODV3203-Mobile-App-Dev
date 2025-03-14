package com.example.mathgameapp.logic

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import kotlin.random.Random

// ViewModel stores the game state and handles logic
class GameViewModel : ViewModel() {
    var numQuestions by mutableStateOf(5) // Total number of questions
    var currentIndex by mutableStateOf(0) // Track the current question index
    var correctAnswers by mutableStateOf(0) // Track correct answers count
    var wrongAnswers by mutableStateOf(0) // Track wrong answers count

    // List to store generated math questions
    private val questions = mutableListOf<Pair<Int, Int>>()

    // Function to generate random addition questions
    fun generateQuestions(count: Int) {
        numQuestions = count
        currentIndex = 0
        correctAnswers = 0
        wrongAnswers = 0
        questions.clear()
        repeat(count) {
            val a = Random.nextInt(1, 20)
            val b = Random.nextInt(1, 20)
            questions.add(Pair(a, b))
        }
    }

    // Get the current question (returns a pair of two numbers)
    fun getCurrentQuestion(): Pair<Int, Int> {
        return if (currentIndex < questions.size) {
            questions[currentIndex]
        } else {
            Pair(0, 0)
        }
    }

    // Function to check if the answer is correct
    fun checkAnswer(userAnswer: String) {
        val correct = questions[currentIndex].first + questions[currentIndex].second
        if (userAnswer.toIntOrNull() == correct) {
            correctAnswers++ // Increment correct answers if correct
        } else {
            wrongAnswers++ // Increment wrong answers if incorrect
        }
        currentIndex++ // Move to the next question
    }

    // Check if the game has ended
    fun isGameOver(): Boolean = currentIndex >= numQuestions
}
