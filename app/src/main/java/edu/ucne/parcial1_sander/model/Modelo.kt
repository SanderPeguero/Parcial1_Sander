package edu.ucne.parcial1_sander.model

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Modelos")
data class Modelo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val cadena1: String = "",

    val cadena2: String = "",

    val double1: Double = 0.0
)
