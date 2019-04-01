package com.xplore.cards.domain

import org.assertj.core.api.Assertions.assertThat
import org.spekframework.spek2.Spek

object DeckTest : Spek({
    group("Initialization Tests") {
        test(" A Standard Deck can be created successfully") {
            val deck = Deck()
            assertThat(deck.cards.size).isEqualTo(54)
        }
        test("A Standard Deck contains the correct number of Clubs") {
            val deck = Deck()
            val clubs = deck.cards.filter { it.suit == Suit.CLUBS }
            assertThat(clubs.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Diamonds") {
            val deck = Deck()
            val diamonds = deck.cards.filter { it.suit == Suit.DIAMONDS }
            assertThat(diamonds.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Hearts") {
            val deck = Deck()
            val hearts = deck.cards.filter { it.suit == Suit.HEARTS }
            assertThat(hearts.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Spades") {
            val deck = Deck()
            val spades = deck.cards.filter { it.suit == Suit.SPADES }
            assertThat(spades.size).isEqualTo(13)
        }
        test("A Standard Deck contains the correct number of Jokers") {
            val deck = Deck()
            val jokers = deck.cards.filter { it.suit == Suit.JOKER }
            assertThat(jokers.size).isEqualTo(2)
        }
    }
})