package edu.ucne.parcial1_sander.ui.articulos

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial1_sander.model.Articulo
import edu.ucne.parcial1_sander.repository.articuloRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class articulosViewModel @Inject constructor(
    val repository: articuloRepository
): ViewModel() {

    var descripcion by mutableStateOf("")
    var marca by mutableStateOf("")
    var existencia by mutableStateOf(0.0)

    fun save(){
        viewModelScope.launch {
            repository.InsertarArticulo(
                Articulo(
                    descripcion = descripcion,
                    marca = marca,
                    existencia = existencia
                )
            )
        }
    }

}

