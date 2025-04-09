package edu.kis.vh.nursery;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Klasa testująca metody klasy DefaultCountingOutRhymer.
 */
public class RhymersJUnitTest {

    /**
     * Testuje metodę countIn().
     */
    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);
        int result = rhymer.peekaboo();
        assertEquals(testValue, result);
    }

    /**
     * Testuje metodę callCheck().
     */
    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        assertTrue(result);
        rhymer.countIn(888);
        result = rhymer.callCheck();
        assertFalse(result);
    }

    /**
     * Testuje metodę isFull().
     */
    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        for (int i = 0; i < 12; i++) {
            assertFalse(rhymer.isFull());
            rhymer.countIn(888);
        }
        assertTrue(rhymer.isFull());
    }

    /**
     * Testuje metodę peekaboo().
     */
    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = DefaultCountingOutRhymer.EMPTY;
        int result = rhymer.peekaboo();
        assertEquals(EMPTY_STACK_VALUE, result);
        int testValue = 4;
        rhymer.countIn(testValue);
        result = rhymer.peekaboo();
        assertEquals(testValue, result);
        result = rhymer.peekaboo();
        assertEquals(testValue, result);
    }

    /**
     * Testuje metodę countOut().
     */
    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = DefaultCountingOutRhymer.EMPTY;
        int result = rhymer.countOut();
        assertEquals(EMPTY_STACK_VALUE, result);
        int testValue = 4;
        rhymer.countIn(testValue);
        result = rhymer.countOut();
        assertEquals(testValue, result);
        result = rhymer.countOut();
        assertEquals(EMPTY_STACK_VALUE, result);
    }
}
