package com.loogibot.flashcard.Card

import android.media.Image
import android.provider.MediaStore

data class Card(
    val id: Int,
    val title: String,
    val description: String,
    val audio: MediaStore.Audio,
    val image: Image
)
