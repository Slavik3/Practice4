import java.io.FileOutputStream;
import java.io.IOException;

public static void write(String fileName, String str2) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);				fos.write(str2.getBytes());
		fos.flush();
		fos.close();
	}
