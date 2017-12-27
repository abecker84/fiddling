package java8.chapter2_lambdas;

import org.junit.Test;

import java8.chapter2_lambdas.aufgabe06.IF1;
import java8.chapter2_lambdas.aufgabe06.IF2;

/**
 * Lösung zu Aufgabe 6
 */
public class Aufgabe06Conflict implements IF1, IF2 {

    @Test
    public void testConflict() {
	new Aufgabe06Conflict().sameMethod();
    }

    public void sameMethod() {
	IF2.super.sameMethod();
    }

}
