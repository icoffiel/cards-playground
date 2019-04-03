package com.xplore.cards.domain

typealias Deck = List<Card>

enum class DeckType {
    STANDARD
}

interface DeckFactory {
    fun create(deckType: DeckType) : Deck
}

class StandardDeckFactory {

    companion object : DeckFactory {
        override fun create(deckType: DeckType): Deck =
                when(deckType) {
                    DeckType.STANDARD -> standardDeck()

        }

        private fun standardDeck(): Deck {
            val clubs = (1..13).map { Card(it, Suit.CLUBS) }
            val diamonds = (1..13).map { Card(it, Suit.DIAMONDS) }
            val hearts = (1..13).map { Card(it, Suit.HEARTS) }
            val spades = (1..13).map { Card(it, Suit.SPADES) }
            val jokers = (1..2).map { Card(14, Suit.JOKER) }
            return clubs + diamonds + hearts + spades + jokers
        }

    }
}