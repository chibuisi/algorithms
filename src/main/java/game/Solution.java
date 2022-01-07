package game;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Player one = new Player("one");
        Player two = new Player("two");
        Player three = new Player("three");
        Player four = new Player("four");
        List<Player> players = Arrays.asList(one, two, three, four);
        Game game = new Game(players);
        game.deal();
    }
}
