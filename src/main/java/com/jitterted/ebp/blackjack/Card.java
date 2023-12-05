package com.jitterted.ebp.blackjack;

//we know our class is a PURE domain class (only deals with business logic)
//once we can see that there are no dependencies on external display libraries and no
//system.out.printlns
//import static org.fusesource.jansi.Ansi.ansi;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public int rankValue() {
        return rank.value();
    }

    //static method: it can be invoked with just the CLASS name
    //as opposed to using an object of the class and then invoking the method
    //static method: Card.display();
    //non-static method: Card co = new Card();
    //co.display();

    public Rank rank() {
        return rank;
    }

    public Suit suit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card {" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (!suit.equals(card.suit)) return false;
        return rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + rank.hashCode();
        return result;
    }
}
