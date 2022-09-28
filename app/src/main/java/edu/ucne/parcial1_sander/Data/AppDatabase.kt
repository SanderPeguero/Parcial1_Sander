package edu.ucne.parcial1_sander.Data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.parcial1_sander.Data.DAO.articulosDAO
import edu.ucne.parcial1_sander.model.Articulo

@Database(
    entities = [Articulo::class],
    version = 2,
    exportSchema = false
)

abstract class AppDatabase: RoomDatabase() {

    abstract val articulosDAO: articulosDAO

}