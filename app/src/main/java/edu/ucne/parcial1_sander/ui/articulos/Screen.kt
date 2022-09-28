package edu.ucne.parcial1_sander.ui.articulos

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.Composable

@Composable
fun articulos(
    onNavigateBack: () -> Unit,
//    viewModel: ScreenViewModel = hiltViewModel()
){
    Scaffold(
        topBar = { Text(text = "Articulos")},
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
//                    viewModel.save()
                    onNavigateBack()
                }

            ){
                Icon(imageVector = Icons.Default.Create, contentDescription = "Agregar")
            }
        }

    ){


    }
}