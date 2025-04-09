package edu.kis.vh.nursery;

/**
 * Implementacja rhymera Hanoi – akceptuje tylko wartości mniejsze niż poprzednie.
 * Odrzuca te, które są większe.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych wartości.
     * @return liczba odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje wartość na stos, jeśli spełnia warunek mniejszości.
     * Większe wartości są odrzucane.
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

