package com.blackjackstrategysimulator;

public class Dealer
{
    private Shoe shoe;
    private DealerHand hand;

    public Dealer(final Shoe shoe, final DealerHand hand)
    {
        this.shoe = shoe;
        this.hand = hand;
    }

    public Card deal()
    {
        return shoe.draw();
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