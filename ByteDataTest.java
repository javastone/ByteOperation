package com.learnJava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ByteDataTest
{

    @Test
    public void testByteAnd()
    {
        // & bitwise add  -  the result bit value is 1 if both number bit value is 1
        int a = 5; //00101
        int b = 9; //01001
        int result = a & b;  //00001
        assertEquals(1, result);
    }

    @Test
    public void testByteOr()
    {
        // & bitwise add  -  the result bit value is 1 if both number bit value is 1
        int a = 5; //00101
        int b = 9; //01001
        int result = a | b;  //01101 (13)
        assertEquals(13, result);
    }

    @Test
    public void testByteXOr()
    {
        // ^ bitwise XOr  -  the result bit value is 1 if corresponding bits are different
        int a = 5; //00101
        int b = 9; //01001
        int result = a ^ b;  //01100  (12)
        assertEquals(12, result);
    }

    @Test
    public void testByteComplement()
    {
        // ~ bitwise complement  -  unary operator, that inverse each bit
        int a = 5; //00101
        int result = ~a;  //11111010  (-6)
        assertEquals(-6, result);
    }

    @Test
    public void testByteAndWithHexadeciaml()
    {
        int a = -3;  //11111101
        assertEquals(128, a & 0x80);  // we can use this to check if the bit 7 value is 1
        assertEquals(64, a & 0x40);  // we can use this to check if the bit 6 value is 1
        assertEquals(32, a & 0x20);  // we can use this to check if the bit 5 value is 1
        assertEquals(16, a & 0x10);  // we can use this to check if the bit 4 value is 1
        assertEquals(8, a & 0x08);  // we can use this to check if the bit 3 value is 1
        assertEquals(4, a & 0x04);  // we can use this to check if the bit 2 value is 1
        assertEquals(0, a & 0x02);  // we can use this to check if the bit 1 value is 1
        assertEquals(1, a & 0x01);  // we can use this to check if the bit 0 value is 1
    }
}
