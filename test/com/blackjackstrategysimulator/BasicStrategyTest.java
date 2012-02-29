package com.blackjackstrategysimulator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BasicStrategyTest
{
    private Hand hand;
    private DealerHand dealerHand;
    private BasicStrategy basicStrategy;

    @Before
    public void setup()
    {
        hand = new Hand();        
        dealerHand = new DealerHand();
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs2IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs3IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs4IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs5IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs6IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs7IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs8IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs9IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20Vs10IsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard20VsAceIsStand()
    {
        deal20ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs2IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs3IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs4IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs5IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs6IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs7IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs8IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs9IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19Vs10IsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard19VsAceIsStand()
    {
        deal19ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs2IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs3IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs4IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs5IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs6IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs7IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs8IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs9IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18Vs10IsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard18VsAceIsStand()
    {
        deal18ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs2IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs3IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs4IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs5IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs6IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs7IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs8IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs9IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17Vs10IsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard17VsAceIsStand()
    {
        deal17ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs2IsStand()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs3IsStand()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs4IsStand()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs5IsStand()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs6IsStand()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs7IsHit()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs8IsHit()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs9IsSurrender()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16Vs10IsSurrender()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard16VsAceIsSurrender()
    {
        deal16ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs2IsStand()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs3IsStand()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs4IsStand()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs5IsStand()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs6IsStand()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs7IsHit()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs8IsHit()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs9IsHit()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15Vs10IsSurrender()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Surrender, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard15VsAceIsHit()
    {
        deal15ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs2IsStand()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs3IsStand()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs4IsStand()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs5IsStand()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs6IsStand()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs7IsHit()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs8IsHit()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs9IsHit()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14Vs10IsHit()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard14VsAceIsHit()
    {
        deal14ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs2IsStand()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs3IsStand()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs4IsStand()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs5IsStand()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs6IsStand()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs7IsHit()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs8IsHit()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs9IsHit()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13Vs10IsHit()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard13VsAceIsHit()
    {
        deal13ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs2IsHit()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs3IsHit()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs4IsStand()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs5IsStand()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs6IsStand()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs7IsHit()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs8IsHit()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs9IsHit()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12Vs10IsHit()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard12VsAceIsHit()
    {
        deal12ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs2IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs3IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs4IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs5IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs6IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs7IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs8IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs9IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11Vs10IsDoubleOrHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard11VsAceIsHit()
    {
        deal11ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs2IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs3IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs4IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs5IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs6IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs7IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs8IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs9IsDoubleOrHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10Vs10IsHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard10VsAceIsHit()
    {
        deal10ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs2IsHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs3IsDoubleOrHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs4IsDoubleOrHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs5IsDoubleOrHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs6IsDoubleOrHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs7IsHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs8IsHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs9IsHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9Vs10IsHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard9VsAceIsHit()
    {
        deal9ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs2IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs3IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs4IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs5IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs6IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs7IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs8IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs9IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard8Vs10IsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }
    
    @Test
    public void verifyBasicStrategyActionForHard8VsAceIsHit()
    {
        deal8ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs2IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs3IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs4IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs5IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs6IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs7IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs8IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs9IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7Vs10IsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard7VsAceIsHit()
    {
        deal7ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs2IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs3IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs4IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs5IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs6IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs7IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs8IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs9IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6Vs10IsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard6VsAceIsHit()
    {
        deal6ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs2IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs3IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs4IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs5IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs6IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs7IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs8IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs9IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5Vs10IsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForHard5VsAceIsHit()
    {
        deal5ToPlayerHand();
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs2IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs3IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs4IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs5IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs6IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs7IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs8IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs9IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20Vs10IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft20VsAceIsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs2IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs3IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs4IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs5IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs6IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs7IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs8IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs9IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19Vs10IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft19VsAceIsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs2IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs3IsDoubleOrStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrStand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs4IsDoubleOrStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrStand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs5IsDoubleOrStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrStand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs6IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrStand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs7IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs8IsStand()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs9IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18Vs10IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft18VsAceIsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs2IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs3IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs4IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs5IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs6IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs7IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs8IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs9IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17Vs10IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft17VsAceIsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs2IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs3IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs4IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs5IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs6IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs7IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs8IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs9IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16Vs10IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft16VsAceIsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs2IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs3IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs4IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs5IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs6IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs7IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs8IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs9IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15Vs10IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft15VsAceIsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs2IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs3IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs4IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs5IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs6IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs7IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs8IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs9IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14Vs10IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft14VsAceIsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs2IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs3IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs4IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs5IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs6IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs7IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs8IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs9IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13Vs10IsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSoft13VsAceIsHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs2IsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs3IsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs4IsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs5IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs6IsDoubleOrHit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs7IsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs8IsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs9IsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVs10IsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForAcePairVsAceIsSplit()
    {
        hand.addCard(Card.ClubAce);
        hand.addCard(Card.ClubAce);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs2IsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs3IsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs4IsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs5IsDoubleOrHit()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs6IsDoubleOrHit()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs7IsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs8IsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs9IsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVs10IsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForTenPairVsAceIsStand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club10);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs2IsSplit()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs3IsSplit()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs4IsSplit()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs5IsDoubleOrHit()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs6IsDoubleOrHit()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs7IsStand()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs8IsSplit()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs9IsSplit()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVs10IsStand()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForNinePairVsAceIsStand()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club9);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Stand, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs2IsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs3IsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs4IsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs5IsDoubleOrHit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs6IsDoubleOrHit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs7IsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs8IsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs9IsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVs10IsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForEightPairVsAceIsSplit()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club8);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs2IsSplit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs3IsSplit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs4IsSplit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs5IsDoubleOrHit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs6IsDoubleOrHit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs7IsSplit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs8IsHit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs9IsHit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVs10IsHit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSevenPairVsAceIsHit()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club7);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs2IsSplit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs3IsSplit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs4IsSplit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs5IsSplit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs6IsSplit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs7IsHit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs8IsHit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs9IsHit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVs10IsHit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForSixPairVsAceIsHit()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club6);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs2IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs3IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs4IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs5IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs6IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs7IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs8IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs9IsDoubleOrHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.DoubleOrHit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVs10IsHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFivePairVsAceIsHit()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club5);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs2IsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs3IsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs4IsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs5IsSplit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs6IsSplit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs7IsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs8IsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs9IsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVs10IsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForFourPairVsAceIsHit()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club4);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs2IsSplit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs3IsSplit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs4IsSplit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs5IsSplit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs6IsSplit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs7IsSplit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs8IsHit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs9IsHit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVs10IsHit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForThreePairVsAceIsHit()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club3);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs2IsSplit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp2();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs3IsSplit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp3();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs4IsSplit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp4();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs5IsSplit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp5();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs6IsSplit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp6();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs7IsSplit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp7();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Split, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs8IsHit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp8();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs9IsHit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp9();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVs10IsHit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUp10();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    @Test
    public void verifyBasicStrategyActionForTwoPairVsAceIsHit()
    {
        hand.addCard(Card.Club2);
        hand.addCard(Card.Club2);
        dealerHandWithFaceUpAce();
        basicStrategy = new BasicStrategy(hand, dealerHand);
        Action action = basicStrategy.resolveAction();
        assertEquals(Action.Hit, action);
    }

    private void dealerHandWithFaceUp2()
    {
        dealerHand.addCard(Card.Club2);
        dealerHand.addCard(Card.Club2);
    }

    private void deal20ToPlayerHand()
    {
        deal15ToPlayerHand();
        hand.addCard(Card.Club5);
    }

    private void dealerHandWithFaceUp3()
    {
        dealerHand.addCard(Card.Club3);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUp4()
    {
        dealerHand.addCard(Card.Club4);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUp5()
    {
        dealerHand.addCard(Card.Club5);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUp6()
    {
        dealerHand.addCard(Card.Club6);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUp7()
    {
        dealerHand.addCard(Card.Club7);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUp8()
    {
        dealerHand.addCard(Card.Club8);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUp9()
    {
        dealerHand.addCard(Card.Club9);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUp10()
    {
        dealerHand.addCard(Card.ClubKing);
        dealerHand.addCard(Card.Club2);
    }

    private void dealerHandWithFaceUpAce()
    {
        dealerHand.addCard(Card.ClubAce);
        dealerHand.addCard(Card.Club2);
    }

    private void deal19ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club9);
    }

    private void deal18ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club8);
    }

    private void deal17ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club7);
    }

    private void deal16ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club6);
    }

    private void deal15ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club5);
    }

    private void deal14ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club4);
    }

    private void deal13ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club3);
    }

    private void deal12ToPlayerHand()
    {
        hand.addCard(Card.Club10);
        hand.addCard(Card.Club2);
    }

    private void deal11ToPlayerHand()
    {
        hand.addCard(Card.Club9);
        hand.addCard(Card.Club2);
    }

    private void deal10ToPlayerHand()
    {
        hand.addCard(Card.Club8);
        hand.addCard(Card.Club2);
    }

    private void deal9ToPlayerHand()
    {
        hand.addCard(Card.Club7);
        hand.addCard(Card.Club2);
    }

    private void deal8ToPlayerHand()
    {
        hand.addCard(Card.Club6);
        hand.addCard(Card.Club2);
    }

    private void deal7ToPlayerHand()
    {
        hand.addCard(Card.Club5);
        hand.addCard(Card.Club2);
    }

    private void deal6ToPlayerHand()
    {
        hand.addCard(Card.Club4);
        hand.addCard(Card.Club2);
    }

    private void deal5ToPlayerHand()
    {
        hand.addCard(Card.Club3);
        hand.addCard(Card.Club2);
    }
}