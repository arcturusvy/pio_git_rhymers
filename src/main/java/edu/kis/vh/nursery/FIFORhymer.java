package edu.kis.vh.nursery;

/**
 * Implementacja rhymera FIFO – pierwsze weszło, pierwsze wyszło.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Tymczasowy rhymer do przechowywania elementów w kolejności FIFO.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Zwraca pierwszy dodany element.
     * Elementy są przechowywane w kolejności FIFO.
     * @return najstarszy element
     */
    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        int ret = temp.countOut();

        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }

        return ret;
    }
}

