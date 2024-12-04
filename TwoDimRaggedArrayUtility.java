package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public static double[][] readFile(File file) throws FileNotFoundException {
		ArrayList<double[]> list = new ArrayList<>();
		Scanner scanner = new Scanner(file);
        //scanner for input
		while (scanner.hasNextLine()) {
			// Split the line 
			String[] line = scanner.nextLine().split("\\s+");
			double[] row = new double[line.length];

			for (int i = 0; i < line.length; i++) {
				try {
					row[i] = Double.parseDouble(line[i]); // Parse each element
				} catch (NumberFormatException e) {
					throw new NumberFormatException("Invalid number format in file at line: " + line + " index: " + i);
				}
			}

			list.add(row);
		}
		scanner.close();

		// Converts the ArrayList to a 2D array
		return list.toArray(new double[0][]);
	}

	public static void writeToFile(double[][] data, File file) throws FileNotFoundException {

		PrintWriter writer = new PrintWriter(file);

		for (double[] row : data) {

			for (double value : row) {

				writer.print(value + " ");

			}
			writer.println();
		}
		writer.close();
	}

	//goes through each row 
	public static double getTotal(double[][] data) {

		double total = 0;
		for (double[] row : data) {

			for (double value : row) {

				total += value;
			}
		}

		return total;

	}

	public static double getRowTotal(double[][] data, int row) {
		double total = 0;

		for (double value : data[row]) {
			total += value;
		}
		return total;
	}

	public static double getColumnTotal(double[][] data, int column) {

		double total = 0;

		for (double[] row : data) {

			if (column < row.length) {

				total += row[column];
			}
		}

		return total;

	}

	public static double getHighestInColumn(double[][] data, int column) {

		double highest = Double.NEGATIVE_INFINITY;

		for (double[] row : data) {

			if (column < row.length && row[column] > highest) {

				highest = row[column];

			}
		}

		return highest;

	}

	
	public static double getLowestInColumn(double[][] data, int column) {

		double lowest = Double.POSITIVE_INFINITY;

		for (double[] row : data) {

			if (column < row.length && row[column] < lowest) {

				lowest = row[column];
			}
		}
		return lowest;

	}

}
