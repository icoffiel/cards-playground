package com.xplore.cards.domain

import org.assertj.core.api.Assertions.assertThat
import org.spekframework.spek2.Spek

object DeckTest : Spek({
    group("Initialization Tests") {
        test(" A Standard Deck can be created successfully") {
            val deck = StandardDeckFactory.create(DeckType.STANDARD)
            assertThat(deck.size).isEqualTo(54)
        }
        test("A Standard Deck contains the correct number of Clubs") {
            val deck = StandardDeckFactory.create(DeckType.STANDARD)
            val clubs = deck.filter { it.suit == Suit.CLUBS }
            assertThat(clubs.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Diamonds") {
            val deck = StandardDeckFactory.create(DeckType.STANDARD)
            val diamonds = deck.filter { it.suit == Suit.DIAMONDS }
            assertThat(diamonds.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Hearts") {
            val deck = StandardDeckFactory.create(DeckType.STANDARD)
            val hearts = deck.filter { it.suit == Suit.HEARTS }
            assertThat(hearts.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Spades") {
            val deck = StandardDeckFactory.create(DeckType.STANDARD)
            val spades = deck.filter { it.suit == Suit.SPADES }
            assertThat(spades.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Jokers") {
            val deck = StandardDeckFactory.create(DeckType.STANDARD)
            val jokers = deck.filter { it.suit == Suit.JOKER }
            assertThat(jokers.size).isEqualTo(2)
        }
    }
})