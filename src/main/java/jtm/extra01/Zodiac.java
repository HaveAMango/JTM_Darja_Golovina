package jtm.extra01;

public class Zodiac {

	int day;
	int month;
	String zodiac;

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = null;
		if (month == 1) {
			if (day < 22) {
				zodiac = "Capricorn";
			} else {
				zodiac = "Sagittarius";
			}
		}
		if (month == 2) {
			if (day < 22) {
				zodiac = "Capricorn";
			} else {
				zodiac = "Aquarius";
			}
		}
		if (month == 3) {
			if (day < 22) {
				zodiac = "Aquarius";
			} else {
				zodiac = "Pisces";
			}
		}
		if (month == 4) {
			if (day < 22) {
				zodiac = "Pisces";
			} else {
				zodiac = "Aries";
			}
		}
		if (month == 5) {
			if (day < 22) {
				zodiac = "Aries";
			} else {
				zodiac = "Taurus";
			}
		}
		if (month == 6) {
			if (day < 22) {
				zodiac = "Taurus";
			} else {
				zodiac = "Gemini";
			}
		}
		if (month == 7) {
			if (day < 22) {
				zodiac = "Gemini";
			} else {
				zodiac = "Cancer";
			}
		}
		if (month == 8) {
			if (day < 22) {
				zodiac = "Cancer";
			} else {
				zodiac = "Leo";
			}
		}
		if (month == 9) {
			if (day < 22) {
				zodiac = "Leo";
			} else {
				zodiac = "Virgo";
			}
		}
		if (month == 10) {
			if (day < 22) {
				zodiac = "Virgo";
			} else {
				zodiac = "Libra";
			}
		}
		if (month == 11) {
			if (day < 22) {
				zodiac = "Libra";
			} else {
				zodiac = "Scorpio";
			}
		}
		if (month == 12) {
			if (day < 22) {
				zodiac = "Scorpio";
			} else {
				zodiac = "Sagittarius";
			}
		}
		// TODO #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// Tropical zodiac, to get appropriate date ranges for signs
		return zodiac;
	}

	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(1, 1));
	}

}
