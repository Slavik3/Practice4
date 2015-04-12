package ua.nure.kozlov.Practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Subtask2 {
	public static String read(String fileName) throws FileNotFoundException {
		String s = "";
		File f = new File(fileName);
		if (!f.exists()) {
			throw new FileNotFoundException();
		} else {
			Scanner in = new Scanner(f);
			while (in.hasNext())
				s += in.nextLine() + "\n";
			in.close();
			return s;
		}
	}

	public static void write(String fileName, String str2) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		fos.write(str2.getBytes());
		fos.flush();
		fos.close();
	}

	public static void main(String[] args) throws IOException {
		String str = Subtask2.read("Subtask2Demo.java");
		System.out.println("начальная строка \n" + str);
		str = str.replaceAll("//.*?\n", "");
		str = str.replaceAll("(?s)/\\*.*\\*/", "");
		System.out.println("str" + str);
		Subtask2.write("Subtask2Demo.java", str);
	}
}