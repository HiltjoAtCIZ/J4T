package org.javafortesters.chapter03;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerTest {

    @Test
    public void test10EqualsHexa() {

        assertEquals("a", Integer.toHexString(10));
    }

    @Test
    public void test11EqualsHexb() {

        assertEquals("b", Integer.toHexString(11));
    }

    @Test
    public void test3EqualsHex3() {

        assertEquals("3", Integer.toHexString(3));
    }

    @Test
    public void test21EqualsHex15() {

        assertEquals("15", Integer.toHexString(21));
    }

    @Test
    public void testIntegerMinValue() {

        assertEquals(-2147483648, Integer.MIN_VALUE);
    }

    @Test
    public void testIntegerMaxValue() {

        assertEquals(2147483647, Integer.MAX_VALUE);
    }

    @Test
    public void testIntegerMinValueParseInt() {

        assertEquals(Integer.parseInt("-2147483648"), Integer.MIN_VALUE);
    }

    @Test
    public void testIntegerMaxValueParseInt() {

        assertEquals(Integer.parseInt("2147483647"), Integer.MAX_VALUE);
    }

    @Test
    public void testIntegerMinValueToString() {

        assertEquals("-2147483648", Integer.toString(Integer.MIN_VALUE));
    }

    @Test
    public void testIntegerMaxValueToString() {

        assertEquals("2147483647", Integer.toString(Integer.MAX_VALUE));
    }

}
