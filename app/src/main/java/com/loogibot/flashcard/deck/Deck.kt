package com.loogibot.flashcard.deck

import androidx.lifecycle.LiveData
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.loogibot.flashcard.card.Card

@Entity(tableName = "deck_table")
data class Deck(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "deck_table")
    val title: String,
    val cards: LiveData<List<Card>>
) {
}