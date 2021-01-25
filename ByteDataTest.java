package com.learnJava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ByteDataTest
{
    @Test
    public void printBitValue(){
        for (int i = 128; i > -129; i--)
        {
            byte b1 = (byte) i;
            String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
            System.out.println(i + " " + s1); // 10000001
        }
    }

    @Test
    public void testBitAnd()
    {
        // & bitwise add  -  the result bit value is 1 if both number bit value is 1
        int a = 5; //00101
        int b = 9; //01001
        int result = a & b;  //00001
        assertEquals(1, result);
    }

    @Test
    public void testBitOr()
    {
        // & bitwise or  -  the result bit value is 1 if either number bit value is 1
        int a = 5; //00101
        int b = 9; //01001
        int result = a | b;  //01101 (13)
        assertEquals(13, result);
    }

    @Test
    public void testBitXOr()
    {
        // ^ bitwise exclusive or  -  the result bit value is 1 if corresponding bits are different
        int a = 5; //00101
        int b = 9; //01001
        int result = a ^ b;  //01100  (12)
        assertEquals(12, result);
    }

    @Test
    public void testBitComplement()
    {
        // ~ bitwise complement  -  unary operator, that inverse each bit
        int a = 5; //00101
        int result = ~a;  //11111010  (-6)
        assertEquals(-6, result);
    }

    @Test
    public void testBitLeftShift()
    {
        // << bitwise left shift by y position
        int a = 5; //0000101
        int result = a<<2;  //10100
        assertEquals(20, result);
    }

    @Test
    public void testBitRightShift()
    {
        // >> bitwise right shift by y position
        int a = 20; //0010100
        int result = a>>2;  //101
        assertEquals(5, result);
    }

    @Test
    public void testBitAndWithHexadeciaml()
    {
        int a = -3;  //11111101
        assertEquals(128, a & 0x80);  // we can use this to check if bit 7 value is 1
        assertEquals(64, a & 0x40);  // we can use this to check if bit 6 value is 1
        assertEquals(32, a & 0x20);  // we can use this to check if bit 5 value is 1
        assertEquals(16, a & 0x10);  // we can use this to check if bit 4 value is 1
        assertEquals(8, a & 0x08);  // we can use this to check if bit 3 value is 1
        assertEquals(4, a & 0x04);  // we can use this to check if bit 2 value is 1
        assertEquals(0, a & 0x02);  // we can use this to check if bit 1 value is 1
        assertEquals(1, a & 0x01);  // we can use this to check if bit 0 value is 1
    }
}
