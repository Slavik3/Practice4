package ua.nure.kozlov.Practice4;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subtask4 {

	public static void write(String fileName, String code) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		String str2 = code;
		fos.write(str2.getBytes());
		fos.flush();
		fos.close();
	}

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(
				"Subtask4IO.java"))) {
			StringBuilder sb = new StringBuilder();
			String code = br.readLine();
			while (code != null) {
				int last = 0;
				Matcher m = Pattern.compile("(?U)(\\w{2,})").matcher(code);
				while (m.find()) {
					sb.append(code.substring(last, m.start()));
					sb.append(m.group(0).toUpperCase());
					last = m.end();
				}
				sb.append(code.substring(last));
				sb.append(System.lineSeparator());
				code = br.readLine();
			}
			code = sb.toString();
			System.out.println(code);
			write("Subtask4IO.java", code);
		}

	}

}
