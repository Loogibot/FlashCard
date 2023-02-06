package com.loogibot.flashcard.card

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.loogibot.flashcard.R

class CardAdapter(private val cards: List<Card>) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    inner class CardViewHolder(binding: View) : RecyclerView.ViewHolder(binding)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v: View = inflater.inflate(R.layout.card_for_deck_view, parent, false)
        return CardViewHolder(v)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val cardTitle = cards[position].title

        holder.itemView.apply {
            findViewById<TextView>(R.id.flash_card_title).text = cardTitle
        }
    }
    override fun getItemCount() = cards.size

}