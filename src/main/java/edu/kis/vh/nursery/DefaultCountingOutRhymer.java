package edu.kis.vh.nursery;

/**
 * Reprezentuje podstawowy stos liczb całkowitych o ograniczonym rozmiarze.
 * Wykorzystywany jako domyślny rhymer.
 */
public class DefaultCountingOutRhymer {

    /**
     * Stała reprezentująca pusty stos.
     */
    public static final int EMPTY = -1;

    /**
     * Maksymalna wielkość stosu.
     */
    public static final int SIZE = 12;

    private final int[] numbers = new int[SIZE];
    private int total = EMPTY;

    /**
     * Zwraca aktualną liczbę elementów na stosie.
     * @return indeks ostatniego elementu
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje wartość na stos, jeśli nie jest pełny.
     * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     * @return true jeśli pusty, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     * @return true jeśli pełny, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == SIZE - 1;
    }

    /**
     * Podgląda ostatni element stosu bez jego usuwania.
     * @return ostatnia wartość lub EMPTY, jeśli stos pusty
     */
    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Zdejmuje ostatnią wartość ze stosu.
     * @return zdjęta wartość lub EMPTY, jeśli stos pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}
