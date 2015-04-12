package ua.nure.kozlov.Practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Subtask5 {

	public static String read(String fileName) throws FileNotFoundException {		
		String s = "";
		File f = new File(fileName);
		if (!f.exists()) {
			throw new FileNotFoundException();
		} else {
			Scanner in = new Scanner(f);
			while (in.hasNext())
				s += in.nextLine() + "\r\n";
			in.close();
			return s;
		}
	}

	public static boolean isInt(String string) {
		if (string == null)
			return false;
		return string.matches("^-?\\d+$");
	}

	public static boolean isDouble(String string) {
		try {
			Double.parseDouble(string);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean isString(String string) {
		int i = 0;
		char c;
		for (; i < string.length(); i++) {
			c = string.charAt(i);
			if (!(c >= 'a' && c <= 'z')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isChar(String string) {
		if (string == null)
			return false;
		return string.matches("^.$");
	}

	public static boolean isBool(String string) {
		if ((string.equals("true")) || (string.equals("false")))
			return true;
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String s = Subtask5.read("Subtask5Demo.txt");
		String arr[] = s.split(" ");
		boolean tmp;
		for (int i = 0; i < arr.length; i++) {
			if (str.equals("int")) {
				tmp = Subtask5.isInt(arr[i]);
				if (tmp == true)
					System.out.println(arr[i]);
			}

			else if (str.equals("double")) {
				tmp = Subtask5.isDouble(arr[i]);
				if (tmp == true)
					System.out.println(arr[i]);
			}

			else if (str.equals("String")) {
				tmp = Subtask5.isString(arr[i]);
				if (tmp == true)
					System.out.println(arr[i]);
			}

			else if (str.equals("char")) {
				tmp = Subtask5.isChar(arr[i]);
				if (tmp == true)
					System.out.println(arr[i]);
			}

			else if (str.equals("boolean")) {
				tmp = Subtask5.isBool(arr[i]);
				if (tmp == true)
					System.out.println(arr[i]);
			}
		}
	}
}
