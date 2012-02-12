package com.blackjackstrategysimulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShoeTest
{
    @Test
    public void verifyOneDeckShoeHas52Cards()
    {
        Shoe shoe = new Shoe(1);
        assertEquals(52, shoe.getSize());
    }
    
    @Test
    public void verifyTwoDeckShoeHas104Cards()
    {
        Shoe shoe = new Shoe(2);
        assertEquals(104, shoe.getSize());
    }
    
    @Test
    public void verifyDeckSizeAfterDrawingIsLessThan52()
    {
        Shoe shoe = new Shoe(1);
        shoe.draw();
        assertTrue(shoe.getSize() < 52);
    }
    
    @Test
    public void verifyDeckIsEmptyAfterDrawing52Times()
    {
        Shoe shoe = new Shoe(1);
        for(int i = 0; i < 52; i++)
        {
            shoe.draw();
        }
        
        assertEquals(0, shoe.getSize());
    }
}
