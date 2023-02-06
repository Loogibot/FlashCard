package com.loogibot.flashcard

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.loogibot.flashcard.deck.DeckList
import com.loogibot.flashcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var deckListView: RecyclerView
    private lateinit var deck: Button

    private var deckList: DeckList = DeckList()
    private lateinit var newDeckButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.activity_main_title)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.randomTestButton
        binding.deckList.listOfDeck

        deckListView = findViewById(R.id.list_of_deck)

        binding.deckList.newDeck.setOnClickListener {
            createNewDeck()
            deckListView.adapter
        }
   }

    private fun createNewDeck() {

        deckList.addDeck()
        Toast.makeText(this, deckList.deckCount.toString(), Toast.LENGTH_SHORT).show()
    }
}