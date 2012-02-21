package com.blackjackstrategysimulator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DealerHandTest
{
    private DealerHand dealerHand;
    
    @Before
    public void setUp()
    {
        dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.ClubKing);
    }

    @Test
    public void verifyDealerHandHidesOneCardInitially()
    {
        Card[] dealerCards = dealerHand.getCards();
        assertEquals(1, dealerCards.length);
    }
    
    @Test
    public void verifyDealerHandShowsAllCardsAfterOpeningUp()
    {
        dealerHand.openUp();
        Card[] dealerCards = dealerHand.getCards();
        assertEquals(2, dealerCards.length);
    }
    
    @Test
    public void verifyDealerCardUp()
    {
        assertEquals(DealersFaceUpCard.Ten, dealerHand.getFaceUpCard());
    }
}