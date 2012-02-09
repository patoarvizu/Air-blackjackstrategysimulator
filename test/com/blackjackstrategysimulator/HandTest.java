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
    public void verifyPairValueAces()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        assertEquals(HandValue.AcePair, hand.getValue());
    }

    @Test
    public void verifyPairValueTwos()
    {
        hand = new Hand();
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        assertEquals(HandValue.TwoPair, hand.getValue());
    }

    @Test
    public void verifyPairValueThrees()
    {
        hand = new Hand();
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        assertEquals(HandValue.ThreePair, hand.getValue());
    }

    @Test
    public void verifyPairValueFours()
    {
        hand = new Hand();
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        assertEquals(HandValue.FourPair, hand.getValue());
    }

    @Test
    public void verifyPairValueFives()
    {
        hand = new Hand();
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        assertEquals(HandValue.FivePair, hand.getValue());
    }

    @Test
    public void verifyPairValueSixes()
    {
        hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        assertEquals(HandValue.SixPair, hand.getValue());
    }

    @Test
    public void verifyPairValueSevens()
    {
        hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        assertEquals(HandValue.SevenPair, hand.getValue());
    }

    @Test
    public void verifyPairValueEights()
    {
        hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        assertEquals(HandValue.EightPair, hand.getValue());
    }

    @Test
    public void verifyPairValueNines()
    {
        hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        assertEquals(HandValue.NinePair, hand.getValue());
    }

    @Test
    public void verifyPairValueTens()
    {
        hand = new Hand();
        hand.addCard(Card.ClubJack);
        hand.addCard(Card.ClubJack);
        assertEquals(HandValue.TenPair, hand.getValue());
    }

    @Test
    public void verifySoftValueAceTwo()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        assertEquals(HandValue.SoftAceTwo, hand.getValue());
    }

    @Test
    public void verifySoftValueAceThree()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        assertEquals(HandValue.SoftAceThree, hand.getValue());
    }

    @Test
    public void verifySoftValueAceFour()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        assertEquals(HandValue.SoftAceFour, hand.getValue());
    }

    @Test
    public void verifySoftValueAceFive()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        assertEquals(HandValue.SoftAceFive, hand.getValue());
    }

    @Test
    public void verifySoftValueAceSix()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        assertEquals(HandValue.SoftAceSix, hand.getValue());
    }

    @Test
    public void verifySoftValueAceSeven()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        assertEquals(HandValue.SoftAceSeven, hand.getValue());
    }

    @Test
    public void verifySoftValueAceEight()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        assertEquals(HandValue.SoftAceEight, hand.getValue());
    }

    @Test
    public void verifySoftValueAceNine()
    {
        hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        assertEquals(HandValue.SoftAceNine, hand.getValue());
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