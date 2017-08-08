package java8.chapter2_lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class Aufgabe03 {

	@Test
	public void aufgabe03vorgabe() {

		final List<String> names = Arrays.asList("Josef", "JÖrg", "Jürgen");

		final Comparator<String> byLength = new Comparator<String>() {

			@Override
			public int compare(final String str1, final String str2) {
				return Integer.compare(str1.length(), str2.length());
			}

		};

		final Comparator<String> caseInsensitive = new Comparator<String>() {

			@Override
			public int compare(final String str1, final String str2) {
				return str1.compareToIgnoreCase(str2);
			}

		};

		names.sort(byLength);
		System.out.println(names);

		names.sort(caseInsensitive);
		System.out.println(names);

	}

	@Test
	public void aufgabe03mitLambdas() {

		final List<String> names = Arrays.asList("Josef", "JÖrg", "Jürgen");

		final Comparator<String> byLength = (str1, str2) -> Integer.compare(str1.length(), str2.length());
		final Comparator<String> caseInsensitive = (str1, str2) -> str1.compareToIgnoreCase(str2);

		Collections.sort(names, byLength);
		System.out.println(names);

		Collections.sort(names, caseInsensitive);
		System.out.println(names);

	}

}
