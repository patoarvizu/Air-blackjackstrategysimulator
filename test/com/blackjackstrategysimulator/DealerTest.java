package com.blackjackstrategysimulator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DealerTest
{
    private Dealer dealer;
    private Shoe deck = new Shoe();
    private DealerHand dealerHand = new DealerHand();
    
    @Before
    public void setUp()
    {
        dealer = new Dealer(deck, dealerHand);
    }

    @Test
    public void verifyDealerDealsCard()
    {
        Card cardDealt = dealer.deal();
        assertTrue(cardDealt != null);
    }
    
    @Test
    public void verifyDealerHandIsNotNull()
    {
        Hand dealerHand = dealer.getHand();
        assertTrue(dealerHand != null);
    }
    
    @Test
    public void dealCardToSelf()
    {
        //TODO: Integration test.
        Hand dealerHand = dealer.getHand();
        int initialSize = dealerHand.getSize();
        dealer.dealCardToSelf();
        assertTrue(dealerHand.getSize() > initialSize);
    }
}
