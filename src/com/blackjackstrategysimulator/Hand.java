package com.blackjackstrategysimulator;

import java.util.ArrayList;
import java.util.List;

public class Hand
{
    protected List<Card> cardsDealt;

    public Hand()
    {
        cardsDealt = new ArrayList<Card>();
    }

    public int getSize()
    {
        return cardsDealt.size();
    }

    public void addCard(Card card)
    {
        cardsDealt.add(card);
    }

    public int getPoints()
    {
        int points = 0;
        for(Card card : cardsDealt)
        {
            points += card.getPoints();
        }
        return points;
    }

    public Card[] getCards()
    {
        Card[] cardArray = new Card[cardsDealt.size()];
        return cardsDealt.toArray(cardArray);
    }

    public HandValue getValue()
    {
        if(twoCardsInHandWithEqualValue())
            return handValueOfPairInHand();
        else if(oneCardInHandIsAce())
            return softHandValue();
        return hardHandValue();
    }

    private HandValue hardHandValue()
    {
        int count = 0;
        for(Card card : cardsDealt)
        {
            count += card.getPoints();
        }
        switch (count)
        {
            case 5:
                return HandValue.HardFive;
            case 6:
                return HandValue.HardSix;
            case 7:
                return HandValue.HardSeven;
            case 8:
                return HandValue.HardEight;
            case 9:
                return HandValue.HardNine;
            case 10:
                return HandValue.HardTen;
            case 11:
                return HandValue.HardEleven;
            case 12:
                return HandValue.HardTwelve;
            case 13:
                return HandValue.HardThirteen;
            case 14:
                return HandValue.HardFourteen;
            case 15:
                return HandValue.HardFifteen;
            case 16:
                return HandValue.HardSixteen;
            case 17:
                return HandValue.HardSeventeen;
            case 18:
                return HandValue.HardEighteen;
            case 19:
                return HandValue.HardNineteen;
            case 20:
                return HandValue.HardTwenty;
            default:
                return null;
        }
    }

    private HandValue softHandValue()
    {
        int countWithoutAce = 0;
        boolean seenAce = false;
        for(Card card : cardsDealt)
        {
            if(!seenAce && card.getRank() == Rank.Ace)
            {
                seenAce = true;
                continue;
            }
            if(card.getPoints() == 11)
                countWithoutAce += 1;
            else
                countWithoutAce += card.getPoints();
        }
        
        switch (countWithoutAce)
        {
            case 9:
                return HandValue.SoftAceNine;
            case 8:
                return HandValue.SoftAceEight;
            case 7:
                return HandValue.SoftAceSeven;
            case 6:
                return HandValue.SoftAceSix;
            case 5:
                return HandValue.SoftAceFive;
            case 4:
                return HandValue.SoftAceFour;
            case 3:
                return HandValue.SoftAceThree;
            case 2:
                return HandValue.SoftAceTwo;
            default:
                break;
        }
        return null;
    }

    public boolean busted()
    {
        boolean seenAce = false;
        int count = 0;
        for(Card card : cardsDealt)
        {
            if(card.getRank() == Rank.Ace)
                seenAce = true;
            count += card.getPoints();
        }
        return (count > 21 && !seenAce) || (count - 10 > 21 && seenAce);
    }

    private boolean oneCardInHandIsAce()
    {
        for(Card card : cardsDealt)
            if(card.getRank() == Rank.Ace)
                return true;
        return false;
    }

    private HandValue handValueOfPairInHand()
    {
        Card card = cardsDealt.get(0);
        switch (card.getRank())
        {
            case Ace:
                return HandValue.AcePair;
            case King:
            case Queen:
            case Jack:
            case Ten:
                return HandValue.TenPair;
            case Nine:
                return HandValue.NinePair;
            case Eight:
                return HandValue.EightPair;
            case Seven:
                return HandValue.SevenPair;
            case Six:
                return HandValue.SixPair;
            case Five:
                return HandValue.FivePair;
            case Four:
                return HandValue.FourPair;
            case Three:
                return HandValue.ThreePair;
            case Two:
                return HandValue.TwoPair;
            default:
                return null;
        }
    }

    private boolean twoCardsInHandWithEqualValue()
    {
        return cardsDealt.size() == 2
                & cardsDealt.get(0).getPoints() == cardsDealt.get(1)
                        .getPoints();
    }

}