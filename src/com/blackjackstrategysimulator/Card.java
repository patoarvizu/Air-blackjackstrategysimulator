package com.blackjackstrategysimulator;

public enum Card
{
    SpadeAce(11, Suit.Spade),
    Spade2(2, Suit.Spade),
    Spade3(3, Suit.Spade),
    Spade4(4, Suit.Spade),
    Spade5(5, Suit.Spade),
    Spade6(6, Suit.Spade),
    Spade7(7, Suit.Spade),
    Spade8(8, Suit.Spade),
    Spade9(9, Suit.Spade),
    Spade10(10, Suit.Spade),
    SpadeJack(10, Suit.Spade),
    SpadeQueen(10, Suit.Spade),
    SpadeKing(10, Suit.Spade),
    ClubAce(11, Suit.Club),
    Club2(2, Suit.Club),
    Club3(3, Suit.Club),
    Club4(4, Suit.Club),
    Club5(5, Suit.Club),
    Club6(6, Suit.Club),
    Club7(7, Suit.Club),
    Club8(8, Suit.Club),
    Club9(9, Suit.Club),
    Club10(10, Suit.Club),
    ClubJack(10, Suit.Club),
    ClubQueen(10, Suit.Club),
    ClubKing(10, Suit.Club),
    DiamondAce(11, Suit.Diamond),
    Diamond2(2, Suit.Diamond),
    Diamond3(3, Suit.Diamond),
    Diamond4(4, Suit.Diamond),
    Diamond5(5, Suit.Diamond),
    Diamond6(6, Suit.Diamond),
    Diamond7(7, Suit.Diamond),
    Diamond8(8, Suit.Diamond),
    Diamond9(9, Suit.Diamond),
    Diamond10(10, Suit.Diamond),
    DiamondJack(10, Suit.Diamond),
    DiamondQueen(10, Suit.Diamond),
    DiamondKing(10, Suit.Diamond),
    HeartAce(11, Suit.Heart),
    Heart2(2, Suit.Heart),
    Heart3(3, Suit.Heart),
    Heart4(4, Suit.Heart),
    Heart5(5, Suit.Heart),
    Heart6(6, Suit.Heart),
    Heart7(7, Suit.Heart),
    Heart8(8, Suit.Heart),
    Heart9(9, Suit.Heart),
    Heart10(10, Suit.Heart),
    HeartJack(10, Suit.Heart),
    HeartQueen(10, Suit.Heart),
    HeartKing(10, Suit.Heart);
    
    private int value;
    private Suit suit;

    private Card(int value, Suit suit)
    {
        this.value = value;
        this.suit = suit;
    }

    public int getPoints()
    {
        return value;
    }
    
    public Suit getSuit()
    {
        return suit;
    }
}
