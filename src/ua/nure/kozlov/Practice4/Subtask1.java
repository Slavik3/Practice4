package ua.nure.kozlov.Practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Subtask1 {

	public static void main(String[] args) throws IOException {
		Parser<String> parser = new Parser<String>(new File("test.txt"));
		for (String str : parser) {
			System.out.println(str);
		}
	}
}

class Parser<T> implements Iterable<T> {
	private File f;

	public Parser(File file) {
		f = file;
	}

	@Override
	public Iterator iterator() {
		return new ParserIterator(f);
	}

	private class ParserIterator implements Iterator<String> {
		private String sentenses[];
		private int index;

		public ParserIterator(File f) {
			String str = "";
			Scanner in = null;

			try {
				in = new Scanner(f);
				while (in.hasNext()) {
					str += in.nextLine();
				}

			} catch (FileNotFoundException e) {
				System.out.println("FileNotFound");
				e.printStackTrace();
			}
			sentenses = str.split("\\. ");
		}

		@Override
		public boolean hasNext() {
			if (sentenses.length > index) {
				index++;
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			return sentenses[index - 1];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

}