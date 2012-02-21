package com.blackjackstrategysimulator;

public class DealerHand extends Hand
{
    private boolean openHand;

    @Override
    public Card[] getCards()
    {
        if(!openHand)
        {
            return new Card[] {cardsDealt.get(0)};
        }
        else
        {
            Card[] cardArray = new Card[getSize()];
            return cardsDealt.toArray(cardArray);
        }
    }

    public void openUp()
    {
        openHand = true;
    }

    public DealersFaceUpCard getFaceUpCard()
    {
        switch (cardsDealt.get(0).getRank())
        {
        case Ace:
            return DealersFaceUpCard.Ace;
        case King:
        case Queen:
        case Jack:
        case Ten:
            return DealersFaceUpCard.Ten;
        case Nine:
            return DealersFaceUpCard.Nine;
        case Eight:
            return DealersFaceUpCard.Eight;
        case Seven:
            return DealersFaceUpCard.Seven;
        case Six:
            return DealersFaceUpCard.Six;
        case Five:
            return DealersFaceUpCard.Five;
        case Four:
            return DealersFaceUpCard.Four;
        case Three:
            return DealersFaceUpCard.Three;
        case Two:
            return DealersFaceUpCard.Two;

        default:
            return null;
        }
    }
}