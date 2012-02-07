package com.blackjackstrategysimulator;

public class Player
{
    private Hand hand;
    private Dealer dealer;

    public Player(final Hand hand, final Dealer dealer)
    {
        this.hand = hand;
        this.dealer = dealer;
    }

    public int getHandSize()
    {
        return hand.getSize();
    }

    public void hit()
    {
        hand.addCard(dealer.deal());
    }
}