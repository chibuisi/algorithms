package gmae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
        Player one = new Player("one", new ArrayList<>());
        Player two = new Player("two", new ArrayList<>());
        Player three = new Player("three", new ArrayList<>());
        Player four = new Player("four", new ArrayList<>());
        List<Player> players = Arrays.asList(one, two, three, four);
        for(Player player : players){
            for(int i = 0; i < 5; i++){
                player.getCards().add(deck.deal());
            }
        }

        for(Player p : players){
            System.out.println(p.getCards());
        }
    }
}
