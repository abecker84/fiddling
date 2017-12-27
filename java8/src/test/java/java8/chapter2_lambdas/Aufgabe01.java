package java8.chapter2_lambdas;

import org.junit.Test;

import java8.chapter2_lambdas.aufgabe01.LongBinaryOperator;

/**
 * Lösung zu Aufgabe 1
 */
public class Aufgabe01 {

    @Test
    public void aufgabe01() {

	// ACHTUNG: Typ Long ist nicht erlaubt!
	/*
	 * final LongBinaryOperator v1 = (long x, Long y) -> { return x + y; };
	 */

	final LongBinaryOperator v2 = (long x, long y) -> {
	    return x + y;
	};

	final LongBinaryOperator v3 = (long x, long y) -> x + y;

	// ACHTUNG: Wenn, dann muss die Typdeklaration für BEIDE Parameter
	// weggelassen werden!
	/*
	 * final LongBinaryOperator v4 = (long x, y) -> x + y;
	 */

	final LongBinaryOperator v5 = (x, y) -> x + y;

	// ACHTUNG: Die Parameter-Klammern dürfen bei mehr als einem Parameter
	// NICHT weggelassen werden!
	/*
	 * final LongBinaryOperator v6 = x, y -> x + y;
	 */
    }

}
