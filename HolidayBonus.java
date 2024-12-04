package application;

public class HolidayBonus {
	private static final double HIGH_BONUS = 5000.0;
	private static final double LOW_BONUS = 1000.0;
	private static final double OTHER = 2000.0;

	public static double[] calculateHolidayBonus(double[][] sales) {

		double[] bonuses = new double[sales.length];
		
		
		// code to get the maximum length 
		int maxLength = 0;

		for (double[] row : sales) {
			maxLength = Math.max(maxLength, row.length);
		}

		for (int col = 0; col < maxLength; col++)

		{
			double highest = TwoDimRaggedArrayUtility.getHighestInColumn(sales, col);

			double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(sales, col);

			int count = 0;

			//validations to verify bonus 
			for (int row = 0; row < sales.length; row++) {
				if (col < sales[row].length && sales[row][col] > 0) {
					count++;
					if (sales[row][col] == highest) {

						bonuses[row] += HIGH_BONUS;
					} else if (sales[row][col] == lowest) {
						bonuses[row] += LOW_BONUS;
					}

					else {
						bonuses[row] += OTHER;
					}

				}
			}
			if (count == 1) {
				for (int row = 0; row < sales.length; row++) {
					if (col < sales[row].length && sales[row][col] == highest) {
						bonuses[row] += HIGH_BONUS;
					}
				}

			}
		}

		return bonuses;
	}

	public static double calculateTotalHolidayBonus(double[][] sales) {

		double[] bonuses = calculateHolidayBonus(sales);

		double totalBonus = 0;
		
		//calculating total for each bonus 

		for (double bonus : bonuses) {
			totalBonus += bonus;
		}

		return totalBonus;
	}

	
}
