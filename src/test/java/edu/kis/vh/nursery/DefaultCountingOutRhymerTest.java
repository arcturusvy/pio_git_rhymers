package edu.kis.vh.nursery;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Prosty test jednostkowy klasy DefaultCountingOutRhymer.
 */
public class DefaultCountingOutRhymerTest {

    /**
     * Testuje działanie countIn(), peekaboo() i countOut().
     */
    @Test
    public void testCountInAndOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 42;

        rhymer.countIn(testValue);
        assertEquals(testValue, rhymer.peekaboo());
        assertEquals(testValue, rhymer.countOut());
        assertEquals(DefaultCountingOutRhymer.EMPTY, rhymer.countOut()); // po zdjęciu – pusty
    }
}
