package edu.ucne.parcial1_sander.ui.Screen

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun Screen(
    onNavigateBack: () -> Unit,
//    viewModel: ScreenViewModel = hiltViewModel()
){
    Scaffold(
        topBar = { Text(text = "Screen")},
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    //viewModel.save()
                    onNavigateBack()
                }

            ){
                Icon(imageVector = Icons.Default.Create, contentDescription = "Agregar")
            }
        }

    ){


    }
}