package edu.ucne.parcial1_sander.ui.ScreenList

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import edu.ucne.parcial1_sander.model.Modelo

@Composable
fun ScreenList(
    onClick: () -> Unit,
    viewModel: ScreenListViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = { Text(text = "Screen") },
        floatingActionButton = {
            FloatingActionButton( onClick = onClick){
                Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar")
            }
        }
    ) {
        val uiState by viewModel.uiState.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(it)
        ) {
            modelList(
                model = uiState.modelo,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
        }
    }
}

@Composable
fun modelList(
    model: List<Modelo>,
    viewModel: ScreenListViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier){
        items(model){
            modelo -> modelRow(modelo, viewModel)
        }
    }
}

@Composable
fun modelRow( model: Modelo, viewModel: modeloList){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)
    ) {
        Text(
            text = "Id: ${model.id}"
        )

        Text(
            text = "Cadena1: ${model.cadena1}"
        )

        Text(
            text = "Cadena2: ${model.cadena2}"
        )

        Row(
            modifier = Modifier.padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            IconButton(
                modifier = Modifier.padding(0.dp),
                //onClick = {viewModel.EliminarPantalla(model)}
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Delete"
                )
            }

        }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            color = Color.LightGray
        )
    }
}

