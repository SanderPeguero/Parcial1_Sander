package edu.ucne.parcial1_sander.ui.Navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.ucne.parcial1_sander.ui.articulos.Screen
import edu.ucne.parcial1_sander.ui.ScreenList.ScreenList

@Composable
fun Navigate(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = "Screen"){
        composable("Screen"){
            Screen({ navController.navigateUp() })
        }
        
        composable("ScreenList"){
            ScreenList(onClick = { navController.navigate("Screen") })
        }
    }
}