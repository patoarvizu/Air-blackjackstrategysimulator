package com.blackjackstrategysimulator;

public enum Card
{
    SpadeAce(Rank.Ace, Suit.Spade),
    Spade2(Rank.Two, Suit.Spade),
    Spade3(Rank.Three, Suit.Spade),
    Spade4(Rank.Four, Suit.Spade),
    Spade5(Rank.Five, Suit.Spade),
    Spade6(Rank.Six, Suit.Spade),
    Spade7(Rank.Seven, Suit.Spade),
    Spade8(Rank.Eight, Suit.Spade),
    Spade9(Rank.Nine, Suit.Spade),
    Spade10(Rank.Ten, Suit.Spade),
    SpadeJack(Rank.Jack, Suit.Spade),
    SpadeQueen(Rank.Queen, Suit.Spade),
    SpadeKing(Rank.King, Suit.Spade),
    ClubAce(Rank.Ace, Suit.Club),
    Club2(Rank.Two, Suit.Club),
    Club3(Rank.Three, Suit.Club),
    Club4(Rank.Four, Suit.Club),
    Club5(Rank.Five, Suit.Club),
    Club6(Rank.Six, Suit.Club),
    Club7(Rank.Seven, Suit.Club),
    Club8(Rank.Eight, Suit.Club),
    Club9(Rank.Nine, Suit.Club),
    Club10(Rank.Ten, Suit.Club),
    ClubJack(Rank.Jack, Suit.Club),
    ClubQueen(Rank.Queen, Suit.Club),
    ClubKing(Rank.King, Suit.Club),
    DiamondAce(Rank.Ace, Suit.Diamond),
    Diamond2(Rank.Two, Suit.Diamond),
    Diamond3(Rank.Three, Suit.Diamond),
    Diamond4(Rank.Four, Suit.Diamond),
    Diamond5(Rank.Five, Suit.Diamond),
    Diamond6(Rank.Six, Suit.Diamond),
    Diamond7(Rank.Seven, Suit.Diamond),
    Diamond8(Rank.Eight, Suit.Diamond),
    Diamond9(Rank.Nine, Suit.Diamond),
    Diamond10(Rank.Ten, Suit.Diamond),
    DiamondJack(Rank.Jack, Suit.Diamond),
    DiamondQueen(Rank.Queen, Suit.Diamond),
    DiamondKing(Rank.King, Suit.Diamond),
    HeartAce(Rank.Ace, Suit.Heart),
    Heart2(Rank.Two, Suit.Heart),
    Heart3(Rank.Three, Suit.Heart),
    Heart4(Rank.Four, Suit.Heart),
    Heart5(Rank.Five, Suit.Heart),
    Heart6(Rank.Six, Suit.Heart),
    Heart7(Rank.Seven, Suit.Heart),
    Heart8(Rank.Eight, Suit.Heart),
    Heart9(Rank.Nine, Suit.Heart),
    Heart10(Rank.Ten, Suit.Heart),
    HeartJack(Rank.Jack, Suit.Heart),
    HeartQueen(Rank.Queen, Suit.Heart),
    HeartKing(Rank.King, Suit.Heart);

    private Rank rank;
    private Suit suit;

    private Card(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public int getPoints()
    {
        return rank.getPoints();
    }

    public Suit getSuit()
    {
        return suit;
    }

    public Rank getRank()
    {
        return rank;
    }
}
