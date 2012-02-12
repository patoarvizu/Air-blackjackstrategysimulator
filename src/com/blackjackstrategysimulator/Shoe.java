package com.blackjackstrategysimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shoe
{
    private List<Card> cardsLeft = new ArrayList<Card>(); 

    public Shoe(int decks)
    {
        for(int i = 0; i < decks; i++)
        {
            Collections.addAll(cardsLeft, Card.values());
        }
    }

    public int getSize()
    {
        return cardsLeft.size();
    }

    public Card draw()
    {
        int rnd = (int) (Math.random() * cardsLeft.size());
        return cardsLeft.remove(rnd);
    }

}
