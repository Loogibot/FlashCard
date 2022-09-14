package com.loogibot.flashcard.Card

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.loogibot.flashcard.databinding.CardListBinding

class CardViewHolder(val binding: CardListBinding) : RecyclerView.ViewHolder(binding.root) {

}

class CardAdapter(private val cards: List<Card>) :
    RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardListBinding.inflate(inflater, parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val card = cards[position]
        holder.apply {
            binding.listOfCardsInDeck.text = card.title
        }
    }

    override fun getItemCount() = cards.size

}