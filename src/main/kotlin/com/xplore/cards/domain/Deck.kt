package com.xplore.cards.domain

class Deck {
    val cards: List<Card>

    init {
        val clubs = (1..13).map { Card(it, Suit.CLUBS) }
        val diamonds = (1..13).map { Card(it, Suit.DIAMONDS) }
        val hearts = (1..13).map { Card(it, Suit.HEARTS) }
        val spades = (1..13).map { Card(it, Suit.SPADES) }
        val jokers = (1..2).map { Card(14, Suit.JOKER) }

        cards = clubs + diamonds + hearts + spades + jokers
    }
}