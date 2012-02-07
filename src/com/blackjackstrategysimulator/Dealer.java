package com.blackjackstrategysimulator;

public class Dealer
{
    private Deck deck;
    private DealerHand hand;

    public Dealer(final Deck deck, final DealerHand hand)
    {
        this.deck = deck;
        this.hand = hand;
    }

    public Card deal()
    {
        return deck.draw();
    }

    public DealerHand getHand()
    {
        return hand;
    }

    public void dealCardToSelf()
    {
        hand.addCard(deal());
    }

    public void dealInitialHand(Player player)
    {
        dealCardToSelf();
        player.hit();
        dealCardToSelf();
        player.hit();
    }
}