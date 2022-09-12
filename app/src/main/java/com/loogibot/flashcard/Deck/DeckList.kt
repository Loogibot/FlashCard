package com.loogibot.flashcard.Deck

import android.widget.EditText

class DeckList {

    var deckCount: Int = -1
    var deckList: List<Deck> = mutableListOf<Deck>(Deck(0,"test_deck"))

    fun addDeck() {
        deckCount += 1
        deckList + Deck(deckCount,"new_Deck")
    }

    fun showDeck() {

    }
}