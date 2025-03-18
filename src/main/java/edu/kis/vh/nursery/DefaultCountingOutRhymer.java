package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void CountIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int CountOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
