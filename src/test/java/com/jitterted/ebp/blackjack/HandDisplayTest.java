package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HandDisplayTest {
    @Test
    public void displayFaceUpCard() throws Exception {
        //problem here: Hand is typically more than one card!!
        //we should add a card to the list
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.ACE),
                                     new Card(Suit.CLUBS, Rank.SEVEN)));

        //hand.displayFaceUpCard and after i moved the method to a new class
        //IntelliJ automagically used the new static method instead!!

        assertThat(ConsoleHand.displayFaceUpCard(hand))
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│A        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        A│\u001B[1B\u001B[11D└─────────┘");
    }

    @Test
    public void displayHand() throws Exception {
        //problem here: Hand is typically more than one card!!
        //we should add a card to the list
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.ACE),
                                     new Card(Suit.CLUBS, Rank.SEVEN),
                                     new Card(Suit.HEARTS, Rank.QUEEN)));

        assertThat(ConsoleHand.cardsAsString(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘[6A[1C[30m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘[6A[1C[31m┌─────────┐[1B[11D│Q        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        Q│[1B[11D└─────────┘");

        }
}
