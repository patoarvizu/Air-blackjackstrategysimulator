package com.blackjackstrategysimulator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicStrategyTest
{

    @Test
    public void verifyBasicStrategyActionForHard20Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs7IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs8IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs9IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs10IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20VsAceIsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs7IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs8IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs9IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs10IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19VsAceIsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs7IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs8IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs9IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs10IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18VsAceIsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs7IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs8IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs9IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs10IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17VsAceIsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs2IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs9IsSurrender()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs8IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs2IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForAce7Vs3IsDoubleOrStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrStand, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs2IsSplit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }
}