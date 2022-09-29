package edu.ucne.parcial1_sander.ui.articulos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@Composable
fun articulos(
    onNavigateBack: () -> Unit,
    viewModel: articulosViewModel = hiltViewModel(),
    articuloId: Int = 0
){
    Scaffold(
        topBar = { Text(text = "Articulos")},
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    viewModel.save()
                    onNavigateBack()
                }

            ){
                Icon(imageVector = Icons.Default.Create, contentDescription = "Agregar")
            }
        }

    ){
        Column(modifier = Modifier.fillMaxSize().padding(8.dp).padding(it)) {

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Descripcion") },
                value = viewModel.descripcion ,
                onValueChange = { viewModel.descripcion = it}
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Marca") },
                value = viewModel.marca ,
                onValueChange = { viewModel.marca = it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Existencia") },
                value = viewModel.existencia.toString() ,
                onValueChange = { viewModel.existencia = it.toDouble()},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }

    }

}