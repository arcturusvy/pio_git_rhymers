package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void CountIn(int in) {
        if (!IsFull())
            NUMBERS[++total] = in;
    }

    public boolean CallCheck() {
        return total == -1;
    }

    public boolean IsFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (CallCheck())
            return -1;
        return NUMBERS[total];
    }

    public int CountOut() {
        if (CallCheck())
            return -1;
        return NUMBERS[total--];
    }

}
