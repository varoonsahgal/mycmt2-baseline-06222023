package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;



public class CardDisplayTest {

    private static final Suit DUMMY_SUIT = Suit.HEARTS ;

    @Test
    public void displayTenAsString() throws Exception {
        Card card = new Card(DUMMY_SUIT, Rank.TEN);
        String display  = ConsoleCard.display(card);

        assertThat(display)
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│10       │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│       10│\u001B[1B\u001B[11D└─────────┘");
    }

    @Test
    public void displayNonTenAsString() throws Exception {
        Card card = new Card(DUMMY_SUIT, Rank.QUEEN);
        String display  = ConsoleCard.display(card);

        assertThat(display)
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│Q        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        Q│\u001B[1B\u001B[11D└─────────┘");
    }


}
