package jtm.extra01;

public class Zodiac {

	
	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		Date date = new Date(day, month);
		for (ZodiacSign sign : ZodiacConfiguration.zodiacSigns) {
			if (sign.getRange().matches(date)) {
				return sign.getName();
			}
		}
		
		return "Invalid input date";
	}

		// TODO #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// Tropical zodiac, to get appropriate date ranges for signs

	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(1, 1));
	}

}
