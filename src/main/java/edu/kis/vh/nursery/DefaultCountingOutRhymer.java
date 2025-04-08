package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_SIZE = 12;
    public static final int EMPTY_INDICATOR = -1;
    public static final int FULL_INDICATOR = 11;

    private final int[] numbers = new int[DEFAULT_SIZE];

    public int total = EMPTY_INDICATOR;

    public void CountIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDICATOR;
        return numbers[total];
    }

    public int CountOut() {
        if (callCheck())
            return EMPTY_INDICATOR;
        return numbers[total--];
    }

}
