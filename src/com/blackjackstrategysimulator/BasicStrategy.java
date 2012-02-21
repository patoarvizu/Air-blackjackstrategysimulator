package com.blackjackstrategysimulator;

public class BasicStrategy
{
    private BasicStrategyActions actions = new BasicStrategyActions();
    private Hand hand;
    private DealerHand dealerHand;

    public BasicStrategy(Hand hand, DealerHand dealerHand)
    {
        this.hand = hand;
        this.dealerHand = dealerHand;
    }

    public Action resolveAction()
    {
        return actions.resolve(hand.getValue(), dealerHand.getFaceUpCard());
    }

}
