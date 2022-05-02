package advanced.practice6.startegy.cards;

import advanced.practice6.startegy.cards.Card;

import java.util.List;
import java.util.Map;

public interface CardDealingStrategy {
    Map<String, List<Card>> dealStacks(Deck deck, int players);
}
