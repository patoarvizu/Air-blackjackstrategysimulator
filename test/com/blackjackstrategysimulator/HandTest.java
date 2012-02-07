package com.blackjackstrategysimulator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class HandTest
{
    private static final int INITIAL_HAND_VALUE = 20;
    
    protected Hand hand;
    
    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        hand = new Hand();
        hand.addCard(Card.ClubKing);
        hand.addCard(Card.ClubKing);
        
    }

    @Test
    public void verifyHandSizeBeforeDealingShouldBeZero()
    {
        hand = new Hand();
        assertEquals(0, hand.getSize());
    }
    
    @Test
    public void verifyHandSizeIncreasesAfterHitting()
    {
        int initialSize = hand.getSize();
        hand.addCard(Card.ClubKing);
        assertTrue(hand.getSize() > initialSize);
    }
        
    @Test
    public void countInitialHandPoints()
    {
        assertEquals(INITIAL_HAND_VALUE, hand.getPoints());
    }
    
    @Test
    public void countPointsBeforeDealingShouldBeZero()
    {
        hand = new Hand();
        assertEquals(0, hand.getPoints());
    }
    
    @Test
    public void verifyCardsCanBeSeen()
    {
        Card[] cards = hand.getCards();
        assertTrue(cards != null);
    }
}