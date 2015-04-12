package ua.nure.kozlov.Practice4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Subtask3 {
	
	public static int rendomFill(int a, int b) {
		int rendom;
		Random r = new Random();
		rendom = a + r.nextInt(b);
		return rendom;
	}

	public static int[] rendomFill(int a, int b, int arr) {
		int[] array1 = new int[arr];
		for (int i = 0; i < arr; i++)
			array1[i] = Subtask3.rendomFill(a, b);
		return array1;
	}

	public static void write(String filename, int[] x) throws IOException {
		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(new FileWriter(filename));
		for (int i = 0; i < x.length; i++) {
			outputWriter.write(x[i] + " ");
		}
		outputWriter.flush();
		outputWriter.close();
	}	

	public static int[] boobleSort(int array[]) {
		int tmp = 0;
		for (int i = 0; i < array.length - 1; i++)
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[i]) {
					tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		return array;
	}

	public static void main(String[] args) throws IOException {
		int[] arr = Subtask3.rendomFill(1, 100, 10);
		Subtask3.write("Subtask3Demo1", arr);
		int sortedArray[] = Subtask3.boobleSort(arr);
		Subtask3.write("Subtask3Demo2", sortedArray);
	}
}
