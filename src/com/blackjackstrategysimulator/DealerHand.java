package com.blackjackstrategysimulator;

public class DealerHand extends Hand
{
    private boolean openHand;

    @Override
    public Card[] getCards()
    {
        if(!openHand)
        {
            return new Card[] {cardsDealt.get(0)};
        }
        else
        {
            Card[] cardArray = new Card[getSize()];
            return cardsDealt.toArray(cardArray);
        }
    }

    public void openUp()
    {
        openHand = true;
    }
}
