package com.example.questnavigasiui_236

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

enum class Navigasi {
    Formulir,
    Detail
}

@Composable
fun DataApp (
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){}