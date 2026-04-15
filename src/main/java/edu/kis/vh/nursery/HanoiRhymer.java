package edu.kis.vh.nursery;

/**
 * Klasa implementująca wyliczankę opartą na zasadach wież Hanoi.
 * W tej wyliczance nie jest możliwe dodanie liczby większej niż bieżąca wartość na szczycie.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Liczba odrzuconych wartości, które nie spełniały warunku dodania.
     */
    private int totalRejected = 0;

/**
     * Zwraca całkowitą liczbę odrzuconych wartości.
     * * @return liczba odrzuconych wartości
     */
    public final int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje nową wartość do wyliczanki.
     * Wartość jest odrzucana (nie jest dodawana), jeśli wyliczanka nie jest pusta,
     * a dodawana liczba jest większa od aktualnej wartości na szczycie.
     * * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Zwraca całkowitą liczbę odrzuconych wartości (getter dla pola totalRejected).
     * * @return liczba odrzuconych wartości
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}