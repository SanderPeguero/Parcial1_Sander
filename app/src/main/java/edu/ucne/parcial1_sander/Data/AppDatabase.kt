package edu.ucne.parcial1_sander.Data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.parcial1_sander.model.Modelo

@Database(
    entities = [Modelo::class],
    version = 2,
    exportSchema = false
)

abstract class AppDatabase: RoomDatabase() {

    //abstract val

}