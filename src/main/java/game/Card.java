package game;

public class Card {
    private Suit suit;
    private Integer value;

    public Card(Suit suit, Integer value) {
        this.suit = suit;
        this.value = value;
    }

    public Card() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face='" + suit + '\'' +
                ", value=" + value +
                '}';
    }
}
