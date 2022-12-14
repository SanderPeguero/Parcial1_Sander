package edu.ucne.parcial1_sander.ui.articulosList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial1_sander.model.Articulo
import edu.ucne.parcial1_sander.repository.articuloRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


data class articuloUiState(
    val articulos: List<Articulo> = emptyList()
)

@HiltViewModel
class articulosListViewModel @Inject constructor(
    val repository: articuloRepository
): ViewModel(){
    private val _uiState = MutableStateFlow(articuloUiState())
    val uiState: StateFlow<articuloUiState> = _uiState.asStateFlow()

    init{
        viewModelScope.launch {
            repository.getAll().collect{ list ->
                _uiState.update{
                    it.copy( articulos = list)
                }
            }
        }
    }

    fun borrarArticulo(articulo: Articulo){
        viewModelScope.launch(
            Dispatchers.IO
        ) {
            repository.EliminarArticulo(articulo)
        }
    }
}
