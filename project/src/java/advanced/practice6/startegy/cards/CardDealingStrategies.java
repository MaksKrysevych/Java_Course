package advanced.practice6.startegy.cards;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return new TexasHoldemCartStrategy();
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return new ClassicPokerCatDealingStrategy();
    }

    public static CardDealingStrategy bridgeCardDealingStrategy() {
        return new BridgeCartDealingStrategy();
    }

    public static CardDealingStrategy foolCardDealingStrategy() {
        return new FoolCardDealingStrategy();
    }
}
