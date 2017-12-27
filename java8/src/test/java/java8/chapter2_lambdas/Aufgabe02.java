package java8.chapter2_lambdas;

import org.junit.Test;

/**
 * Lösung zu Aufgabe 2
 */
public class Aufgabe02 {

    @Test
    public void aufgabe02a() {

	final Runnable runner = () -> System.out.println("I say hello lambda world");
	new Thread(runner).start();

    }

    @Test
    public void aufgabe02b1() {

	String messageText = "world";
	final Runnable runner = () -> System.out.println("I say hello lambda " + messageText);
	new Thread(runner).start();

    }

    @Test
    public void aufgabe02b2() {

	String messageText = "world";
	final Runnable runner = provideTextOutput(messageText);
	new Thread(runner).start();

    }

    private Runnable provideTextOutput(String s) {

	return () -> System.out.println("I say hello lambda " + s);

    }

}
