package java8.chapter2_lambdas;

import java.io.File;
import java.io.FileFilter;

import org.junit.Test;

public class Aufgabe05 {

	@Test
	public void aufgabe05vorgabe() {

		final FileFilter directoryFilter = new FileFilter() {
			public boolean accept(final File pathname) {
				return pathname.isDirectory();
			}
		};

		final FileFilter pdfFileFilter = new FileFilter() {
			public boolean accept(final File pathname) {
				return (pathname.isFile() && pathname.getName().toLowerCase().endsWith(".pdf"));
			}
		};

	}

	@Test
	public void aufgabe05mitMethodenreferenzUndLambda() {

		final FileFilter directoryFilter = this::isDirectory;
		final FileFilter pdfFileFilter = (pathname) -> pathname.isFile()
				&& pathname.getName().toLowerCase().endsWith(".pdf");

	}

	private boolean isDirectory(final File pathname) {
		return pathname.isDirectory();
	}

}
