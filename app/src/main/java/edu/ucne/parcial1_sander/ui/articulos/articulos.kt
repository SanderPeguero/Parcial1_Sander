package edu.ucne.parcial1_sander.ui.articulos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


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
        Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {

        }

    }
}