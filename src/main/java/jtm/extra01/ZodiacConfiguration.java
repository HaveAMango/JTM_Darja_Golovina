package jtm.extra01;

public class ZodiacConfiguration {

	static int[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static ZodiacSign[] zodiacSigns = {
		new ZodiacSign("Aries", new Range(new Date(21,3), new Date(20,4))),
		new ZodiacSign("Taurus", new Range(new Date(21,4), new Date(21,5))),
		new ZodiacSign("Gemini", new Range(new Date(22,5), new Date(21,6))),
		new ZodiacSign("Cancer", new Range(new Date(22,6), new Date(22,7))),
		new ZodiacSign("Leo", new Range(new Date(23,7), new Date(22,8))),
		new ZodiacSign("Virgo", new Range(new Date(23,8), new Date(23,9))),
		new ZodiacSign("Libra", new Range(new Date(24,9), new Date(23,10))),
		new ZodiacSign("Scorpio", new Range(new Date(24,10), new Date(22,11))),
		new ZodiacSign("Sagittarius", new Range(new Date(23,11), new Date(21,12))),
		new ZodiacSign("Capricorn", new Range(new Date(22,12), new Date(20,1))),
		new ZodiacSign("Aquarius", new Range(new Date(21,1), new Date(19,2))),
		new ZodiacSign("Pisces", new Range(new Date(20,2), new Date(20,3)))
	};
}