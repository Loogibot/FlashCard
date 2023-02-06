package com.loogibot.flashcard.card

import android.media.Image
import android.provider.MediaStore
import android.provider.MediaStore.Audio
import android.provider.MediaStore.Images.ImageColumns
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Blob

@Entity(tableName = "card_table")
data class Card(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "audio")
    val audio: Blob,
    @ColumnInfo(name = "image")
    val image: Image,
    @ColumnInfo(name = "difficulty")
    val difficulty: Int?,
    @ColumnInfo(name = "parent_deck")
    val parentDeck: Int
) {

}