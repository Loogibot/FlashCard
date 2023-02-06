package com.loogibot.flashcard.deck

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Deck::class], version = 1)
abstract class DeckDatabase : RoomDatabase() {
    abstract fun deckDao(): DeckDao

    companion object {
        @Volatile
        private var INSTANCE: DeckDatabase? = null

        fun getDatabase(context: Context): DeckDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DeckDatabase::class.java,
                    "deck_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}