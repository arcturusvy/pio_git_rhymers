package edu.kis.vh.nursery;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultCountingOutRhymerTest {

    @Test
    public void testCountInAndOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(42);

        assertEquals(42, rhymer.peekaboo());
        assertEquals(42, rhymer.countOut());
        assertEquals(DefaultCountingOutRhymer.EMPTY, rhymer.countOut()); // bo już pusty
    }
}
