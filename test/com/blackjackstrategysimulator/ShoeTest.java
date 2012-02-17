package com.blackjackstrategysimulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class ShoeTest
{
    private static final int ENTIRE_DECK = 52;
    private static final int ALMOST_ENTIRE_DECK = 50;

    @Test
    public void verifyOneDeckShoeHas52Cards()
    {
        Shoe shoe = new Shoe();
        assertEquals(52, shoe.getSize());
    }
    
    @Test
    public void verifyTwoDeckShoeHas104Cards()
    {
        Shoe shoe = new Shoe(2);
        assertEquals(104, shoe.getSize());
    }
    
    @Test
    public void verifyDeckSizeAfterDrawingIsLessThan52()
    {
        Shoe shoe = new Shoe();
        shoe.draw();
        assertTrue(shoe.getSize() < 52);
    }
    
    @Test
    public void verifyDeckIsEmptyAfterDrawing52Times()
    {
        Shoe shoe = new Shoe();
        for(int i = 0; i < ENTIRE_DECK; i++)
        {
            shoe.draw();
        }
        
        assertEquals(0, shoe.getSize());
    }
    
    @Test
    public void verifyCardsAreDrawnAtRandom()
    {
      Shoe shoe = new Shoe();
      ArrayList<Card> sortedCards = new ArrayList<Card>();
      Collections.addAll(sortedCards, Card.values());
      for(Card sortedCard : sortedCards)
      {
        Card drawnCard = shoe.draw();
        if(sortedCard != drawnCard)
        {
          return;
        }
      }
      fail();
    }
    
    @Test
    public void verifyShoeHasCut()
    {
      Shoe shoe = new Shoe();
      for(int i = 0; i < ALMOST_ENTIRE_DECK; i++)
      {
        shoe.draw();
      }
      assertTrue(shoe.hasCrossedCut());
    }
    
    @Test
    public void verifyCutIsNeverReachedAfterDrawing70PercentOfShoeWithOneDeck()
    {
      Shoe shoe = new Shoe();
      for(int i = 0; i <= (int) (ENTIRE_DECK * .7); i++)
      {
        shoe.draw();
      }
      assertFalse(shoe.hasCrossedCut());
    }
    
    @Test
    public void verifyCutIsAlwaysReachedAfterDrawing80PercentOfShoeWithOneDeck()
    {
      Shoe shoe = new Shoe();
      for(int i = 0; i <= (int) (ENTIRE_DECK * .8); i++)
      {
        shoe.draw();
      }
      assertTrue(shoe.hasCrossedCut());
    }
    
    @Test
    public void verifyCutIsNeverReachedAfterDrawing70PercentOfShoeWithMultipleDecks()
    {
      Shoe shoe = new Shoe(3);
      for(int i = 0; i <= (int) (3 * ENTIRE_DECK * .7); i++)
      {
        shoe.draw();
      }
      assertFalse(shoe.hasCrossedCut());
    }
    
    @Test
    public void verifyCutIsAlwaysReachedAfterDrawing80PercentOfShoeWithMultipleDecks()
    {
      Shoe shoe = new Shoe(3);
      for(int i = 0; i <= (int) (3 * ENTIRE_DECK * .8); i++)
      {
        shoe.draw();
      }
      assertTrue(shoe.hasCrossedCut());
    }
    
    @Test
    public void runCardCutTests10000TimesForAssurance()
    {
      for(int i = 0; i < 10000; i++)
      {
        verifyCutIsNeverReachedAfterDrawing70PercentOfShoeWithOneDeck();
        verifyCutIsAlwaysReachedAfterDrawing80PercentOfShoeWithOneDeck();
        verifyCutIsNeverReachedAfterDrawing70PercentOfShoeWithMultipleDecks();
        verifyCutIsAlwaysReachedAfterDrawing80PercentOfShoeWithMultipleDecks();
      }
    }
}