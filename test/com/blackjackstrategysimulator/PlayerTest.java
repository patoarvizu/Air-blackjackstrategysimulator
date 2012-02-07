package com.blackjackstrategysimulator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PlayerTest
{
    private Player player;
    private Hand hand;
    @Mock private Dealer dealer;
    
    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        hand = new Hand();
        hand.addCard(Card.ClubKing);
        hand.addCard(Card.SpadeKing);
        player = new Player(hand, dealer);
    }

    @Test
    public void verifyPlayerIsInitiallyDealtTwoCards()
    {
        assertEquals(2, player.getHandSize());
    }
    
    @Test
    public void verifyHandSizeIncreasesWhenPlayerHits()
    {
        player.hit();
        assertEquals(3, player.getHandSize());
    }
}