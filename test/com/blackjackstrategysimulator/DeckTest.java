package com.blackjackstrategysimulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DeckTest
{
    private Deck deck;
    
    @Before
    public void setUp()
    {
        deck = new Deck();
    }

    @Test
    public void verifyInitialDeckSizeIs52()
    {
        assertEquals(52, deck.getSize());
    }
    
    @Test
    public void verifyDeckSizeAfterDrawingIsLessThan52()
    {
        deck.draw();
        assertTrue(deck.getSize() < 52);
    }
    
    @Test
    public void verifyDeckIsEmptyAfterDrawing52Times()
    {
        for(int i = 0; i < 52; i++)
        {
            deck.draw();
        }
        
        assertEquals(0, deck.getSize());
    }
}