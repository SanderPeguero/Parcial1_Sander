package edu.ucne.parcial1_sander.ui.ScreenList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial1_sander.model.Modelo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


data class modeloList(
    val modelo: List<Modelo> = emptyList()
)

@HiltViewModel
class ScreenListViewModel @Inject constructor(
    //val repository: -repository name-
): ViewModel(){
    private val _uiState = MutableStateFlow(modeloList())
    val uiState: StateFlow<modeloList> = _uiState.asStateFlow()

    init{
        viewModelScope.launch {
//            repository.getAll().collect { list ->
//                _uiState.update{
//                    it.copy( modelo = list)
//                }
//            }
        }
    }

    fun borrarModelo(modelo: Modelo){
        viewModelScope.launch(
            Dispatchers.IO
        ) {
//            repository.BorrarModelo(modelo)
        }
    }
}
