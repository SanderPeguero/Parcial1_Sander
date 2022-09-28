package edu.ucne.parcial1_sander.Data.DAO

import androidx.room.*
import edu.ucne.parcial1_sander.model.Articulo
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticulosDAO{

    @Insert
    suspend fun InsertarArticulo(articulo: Articulo)

    @Update
    suspend fun ActualizarArticulo(articulo: Articulo)

    @Delete
    suspend fun EliminarArticulo(articulo: Articulo)

    @Query("select * from Articulos where articuloId = :articuloId ")
    fun getArticulo (articuloId: Int): Flow<Articulo>

    @Query("select * from Articulos")
    fun getAll(): Flow<List<Articulo>>


}
