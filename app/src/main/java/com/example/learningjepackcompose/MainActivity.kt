package com.example.learningjepackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningjepackcompose.ui.theme.LearningJepackComposeTheme
import com.example.learningjepackcompose.view.ListaTarefas
import com.example.learningjepackcompose.view.SalvarTarefa

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJepackComposeTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "listaTarefas") {
                    composable(route = "listaTarefas") {
                        ListaTarefas(navController)
                    }
                    composable(route = "salvarTarefa") {
                        SalvarTarefa(navController)
                    }
                }
            }
        }
    }
}


