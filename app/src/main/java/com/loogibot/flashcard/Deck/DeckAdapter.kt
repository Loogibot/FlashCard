package com.loogibot.flashcard.Deck

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.loogibot.flashcard.R

class DeckAdapter(private val deckList: List<Deck>) :
    RecyclerView.Adapter<DeckAdapter.DeckViewHolder>() {

    inner class DeckViewHolder(binding: View) : RecyclerView.ViewHolder(binding)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeckAdapter.DeckViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v: View = inflater.inflate(R.layout.deck_for_deck_list, parent, false)
        return DeckViewHolder(v)
    }

    override fun onBindViewHolder(holder: DeckAdapter.DeckViewHolder, position: Int) {
        val deckTitle = deckList[position].title

        holder.itemView.apply {
            findViewById<TextView>(R.id.flash_card_title).text = deckTitle
        }
    }

    override fun getItemCount() = deckList.size

}