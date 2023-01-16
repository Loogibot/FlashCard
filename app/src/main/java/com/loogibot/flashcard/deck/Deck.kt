package com.loogibot.flashcard.Deck

import com.loogibot.flashcard.Card.Card

data class Deck(val id: Int, val title: String) {
    val deckSize = 0

    var deck: List<Card> = mutableListOf()

    fun addCard() {

    }

}
