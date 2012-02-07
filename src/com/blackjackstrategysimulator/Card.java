package com.blackjackstrategysimulator;

public enum Card
{
    SpadeAce(11),
    Spade2(2),
    Spade3(3),
    Spade4(4),
    Spade5(5),
    Spade6(6),
    Spade7(7),
    Spade8(8),
    Spade9(9),
    Spade10(10),
    SpadeJack(10),
    SpadeQueen(10),
    SpadeKing(10),
    ClubAce(11),
    Club2(2),
    Club3(3),
    Club4(4),
    Club5(5),
    Club6(6),
    Club7(7),
    Club8(8),
    Club9(9),
    Club10(10),
    ClubJack(10),
    ClubQueen(10),
    ClubKing(10),
    DiamondAce(11),
    Diamond2(2),
    Diamond3(3),
    Diamond4(4),
    Diamond5(5),
    Diamond6(6),
    Diamond7(7),
    Diamond8(8),
    Diamond9(9),
    Diamond10(10),
    DiamondJack(10),
    DiamondQueen(10),
    DiamondKing(10),
    HeartAce(11),
    Heart2(2),
    Heart3(3),
    Heart4(4),
    Heart5(5),
    Heart6(6),
    Heart7(7),
    Heart8(8),
    Heart9(9),
    Heart10(10),
    HeartJack(10),
    HeartQueen(10),
    HeartKing(10);
    
    private int value;

    private Card(int value)
    {
        this.value = value;
    }

    public int getPoints()
    {
        return value;
    }
}
