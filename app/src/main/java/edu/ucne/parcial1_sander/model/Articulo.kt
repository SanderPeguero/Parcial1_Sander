package edu.ucne.parcial1_sander.model

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Articulos")
data class Articulo(
    @PrimaryKey(autoGenerate = true)
    val articuloId: Int = 0,

    val descripcion: String = "",

    val marca: String = "",

    val existencia: Double = 0.0
)
