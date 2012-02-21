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
    public void verifyBasicStrategyActionForHard16Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs7IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
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
    public void verifyBasicStrategyActionForHard16Vs10IsSurrender()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16VsAceIsSurrender()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs7IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs8IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs9IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs10IsSurrender()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs7IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs8IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs9IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs10IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs2IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs3IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs7IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs8IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs9IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs10IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
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
    public void verifyBasicStrategyActionForHard12Vs3IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs4IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs5IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs6IsStand()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs7IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs8IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs9IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs10IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
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
    public void verifyBasicStrategyActionForHard11Vs3IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs4IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs5IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs6IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs7IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs8IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs9IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs10IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs2IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs3IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs4IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs5IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs6IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs7IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs8IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs9IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs10IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs2IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs3IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs4IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs5IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs6IsDoubleOrHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs7IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs8IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs9IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs10IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs2IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs3IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs4IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs5IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs6IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs7IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs8IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs9IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs10IsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8VsAceIsHit()
    {
        Hand hand = new Hand();
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
        DealerHand dealerHand = new DealerHand();
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
        BasicStrategy basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
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