package edu.ucne.parcial1_sander.repository

import edu.ucne.parcial1_sander.model.Articulo
import edu.ucne.parcial1_sander.Data.AppDatabase
import javax.inject.Inject

class articuloRepository @Inject constructor(
    val db: AppDatabase
){
    suspend fun InsertarArticulo(articulo: Articulo){
        db.articulosDAO.InsertarArticulo(articulo)
    }

    suspend fun ActualizarArticulo(articulo: Articulo){
        db.articulosDAO.ActualizarArticulo(articulo)
    }

    suspend fun EliminarArticulo(articulo: Articulo){
        db.articulosDAO.EliminarArticulo(articulo)
    }

    fun getAll() = db.articulosDAO.getAll()
}