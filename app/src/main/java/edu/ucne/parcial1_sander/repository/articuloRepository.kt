package edu.ucne.parcial1_sander.repository

import edu.ucne.parcial1_sander.model.Articulo
import edu.ucne.parcial1_sander.Data.AppDatabase
import javax.inject.Inject

class articuloRepository @Inject constructor(
    val db: AppDatabase
){
    suspend fun InsertarArticulo(articulo: Articulo){
        db.articulosDAO.Insertar(articulo)
    }

    suspend fun ActualizarArticulo(articulo: Articulo){
        db.articulosDAO.Actualizar(articulo)
    }

    suspend fun EliminarArticulo(articulo: Articulo){
        db.articulosDAO.Eliminar(articulo)
    }

    fun getAll() = db.articulosDAO.getAll()
}