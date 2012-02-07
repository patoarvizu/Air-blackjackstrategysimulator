package com.blackjackstrategysimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck
{
    
    private List<Card> cardsLeft = new ArrayList<Card>();
    
    public Deck()
    {
        Collections.addAll(cardsLeft, Card.values());
        Collections.shuffle(cardsLeft);
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