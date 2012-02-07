package com.blackjackstrategysimulator;

import java.util.ArrayList;
import java.util.List;

public class Hand
{
    protected List<Card> cardsDealt;

    public Hand()
    {
        cardsDealt = new ArrayList<Card>();
    }

    public int getSize()
    {
        return cardsDealt.size();
    }

    public void addCard(Card card)
    {
        cardsDealt.add(card);
    }

    public int getPoints()
    {
        int points = 0;
        for(Card card : cardsDealt)
        {
            points += card.getPoints();
        }
        return points;
    }

    public Card[] getCards()
    {
        Card[] cardArray = new Card[cardsDealt.size()];
        return cardsDealt.toArray(cardArray);
    }

}