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
        else if(oneCardInHandIsAce() && !busted())
            return softHandValue();
        return null;
    }

    private HandValue softHandValue()
    {
        int countWithoutAce = 0;
        boolean seenAce = false;
        for(Card card : cardsDealt)
        {
            if(!seenAce && card.getPoints() == 11)
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

    private boolean busted()
    {
        boolean seenAce = false;
        int count = 0;
        for(Card card : cardsDealt)
        {
            if(card.getPoints() == 11)
                seenAce = true;
            count += card.getPoints();
        }
        return (count > 21 && !seenAce) || (count - 10 > 21 && seenAce);
    }

    private boolean oneCardInHandIsAce()
    {
        for(Card card : cardsDealt)
            if(card.getPoints() == 11)
                return true;
        return false;
    }

    private HandValue handValueOfPairInHand()
    {
        Card card = cardsDealt.get(0);
        switch (card.getPoints())
        {
            case 11:
                return HandValue.AcePair;
            case 10:
                return HandValue.TenPair;
            case 9:
                return HandValue.NinePair;
            case 8:
                return HandValue.EightPair;
            case 7:
                return HandValue.SevenPair;
            case 6:
                return HandValue.SixPair;
            case 5:
                return HandValue.FivePair;
            case 4:
                return HandValue.FourPair;
            case 3:
                return HandValue.ThreePair;
            case 2:
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