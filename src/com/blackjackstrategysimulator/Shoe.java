package com.blackjackstrategysimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shoe
{
    private static final int LOWER_LIMIT_CUT = (int) (.2 * 52) + 1;
    private static final int UPPER_LIMIT_CUT = (int) (.3 * 52);
    
    List<Card> cardsLeft = new ArrayList<Card>();
    private boolean crossedCut = false;
    int cut;
    
    public Shoe()
    {
      this(1);
    }

    public Shoe(int decks)
    {
        for(int i = 0; i < decks; i++)
        {
            Collections.addAll(cardsLeft, Card.values());
        }
        cut = decks * LOWER_LIMIT_CUT + (int)(Math.random() * ((UPPER_LIMIT_CUT - LOWER_LIMIT_CUT) + 1));
    }

    public int getSize()
    {
        return cardsLeft.size();
    }

    public Card draw()
    {
        int rnd = (int) (Math.random() * cardsLeft.size());
        if(shoeReachedCutCard())
        {
          crossedCut = true;
        }
        return cardsLeft.remove(rnd);
    }

    public boolean hasCrossedCut()
    {
      return crossedCut;
    }

    private boolean shoeReachedCutCard()
    {
      return cardsLeft.size() == cut;
    }

}
