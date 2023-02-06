package com.loogibot.flashcard.card

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CardDao {
    @Query("SELECT * FROM card_table")
    fun getCards(): Flow<List<Card>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCard(card: Card)

    @Query("DELETE FROM card_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM card_table ORDER BY difficulty DESC")
    suspend fun getCardListByDiffDesc(): Flow<List<Card>>
}