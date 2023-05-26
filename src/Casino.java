import java.util.ArrayList;

public class Casino {

    ArrayList<Card> deck;

    public static void main(String[] args) {
        Casino table = new Casino();
    }

    public Casino() {

        createDeck();
        printDeck();

    }

    public void createDeck() {
        deck = new ArrayList<>();

        //loop through each suit 0-3
        for (int x = 0; x < 4; x++) {
            //loop through each card number (13 of them, A through K)
            for (int y = 2; y < 15; y++) {
                // will need to add loops, more if statements in the other classes
                deck.add(new Card(x, y));
            }
        }
    }

    public void printDeck() {
        for (int y = 0; y < 52; y++) {
            deck.get(y).printCardInfo();
        }
    }
}