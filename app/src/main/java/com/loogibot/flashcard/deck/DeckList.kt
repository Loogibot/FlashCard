package com.loogibot.flashcard.deck

class DeckList {

    var deckCount: Int = -1
//    var deckList: List<Deck> = mutableListOf<Deck>(Deck(0, "test_deck", cards = LiveData<>))

    fun addDeck() {
        deckCount += 1
//        deckList + Deck(deckCount,"new_Deck", cards = LiveData<List<Card>>())
    }

    fun showDeck() {

    }
}