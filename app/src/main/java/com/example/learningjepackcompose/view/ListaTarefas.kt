package com.example.learningjepackcompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.learningjepackcompose.R
import com.example.learningjepackcompose.ui.theme.Purple40
import com.example.learningjepackcompose.ui.theme.White

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaTarefas(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(text = "Lista de Tarefas", fontSize = 18.sp, fontWeight = FontWeight.Bold , color = Color.White)
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Purple40,
                titleContentColor = White,
            )
        )
    },
        containerColor = Color.Black,
        floatingActionButton = {
            FloatingActionButton( onClick = {
                navController.navigate("salvarTarefa")
            }, containerColor = Purple40,
                ) {
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_add), contentDescription = "Add")
            }
        }
    ) {

    }
}