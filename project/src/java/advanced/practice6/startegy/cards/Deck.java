package advanced.practice6.startegy.cards;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface Deck{
    Card dealCard();
    List<Card> restCards();
    int size();
}
class DeckImplementation implements Deck {

    LinkedList<Card> cards;

    public DeckImplementation(final int cardsAmount) {
        this.cards = new LinkedList<>();
        for (int i = 0; i < cardsAmount; i++) {
            cards.push(new CardImplementation(i));
        }
    }

    @Override
    public Card dealCard() {
        return cards.size() == 0 ? null : cards.pop();
    }

    @Override
    public List<Card> restCards() {
        final ArrayList<Card> rest = new ArrayList<>(this.cards);
        cards.clear();
        return rest;
    }

    @Override
    public int size() {
        return cards.size();
    }
}
