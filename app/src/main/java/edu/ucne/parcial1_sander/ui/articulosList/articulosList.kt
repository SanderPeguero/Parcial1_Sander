package edu.ucne.parcial1_sander.ui.articulosList

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import edu.ucne.parcial1_sander.model.Articulo

@Composable
fun articulosList(
    onClick: () -> Unit,
    viewModel: articulosListViewModel = hiltViewModel()
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
            articuloList(
                model = uiState.articulo,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
        }
    }
}

@Composable
fun articuloList(
    articulos: List<Articulo>,
    viewModel: articulosListViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier){
        items(articulos){
            articulo -> modelRow(articulo, viewModel)
        }
    }
}

@Composable
fun modelRow(articulo: Articulo, viewModel: articuloList){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)
    ) {
        Text(
            text = "ArticuloId: ${articulo.articuloId}"
        )

        Text(
            text = "Descripcion: ${articulo.descripcion}"
        )

        Text(
            text = "Marca: ${articulo.marca}"
        )

        Text(
            text = "Existencia: ${articulo.existencia}"
        )

        Row(
            modifier = Modifier.padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            IconButton(
                modifier = Modifier.padding(0.dp),
                onClick = { viewModel.EliminarArticulo(articulo) }
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

