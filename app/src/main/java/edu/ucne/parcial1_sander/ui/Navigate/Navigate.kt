package edu.ucne.parcial1_sander.ui.Navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.ucne.parcial1_sander.ui.articulos.articulos
import edu.ucne.parcial1_sander.ui.articulosList.articulosListScreen

@Composable
fun Navigate(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = "Articulos"){
        composable("Articulos"){
            articulos({ navController.navigateUp() })
        }
        
        composable("ArticulosList"){
            articulosListScreen(onClick = { navController.navigate("ArticulosList") })
        }
    }
}