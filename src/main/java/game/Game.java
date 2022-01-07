package game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Deck deck;
    private List<Card> toCards;
    private List<Card> fromCards;

    public Game(List<Player> players) {
        deck = new Deck();
        this.players = players;
        toCards = new ArrayList<>();
        fromCards = new ArrayList<>();
    }

    public void shuffleDeck(){
        deck.shuffle();
    }

    public void deal(){
        for(Player player : players){
            for(int i = 0; i < 5; i++){
                player.getCards().add(deck.deal());
            }
        }
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void start(){

    }
}
