package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
        Card card = null;
        for(Suit s : Suit.values()){
            for(int i = 2; i <= 13; i++){
                card = new Card(s,i);
                cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }

    public Card deal(){
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
}
