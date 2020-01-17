package jtm.extra01;

public class ZodiacSign {

	private String name;
	private ZodiacRange range;

	public ZodiacSign(String name, ZodiacRange range) {
		this.name = name;
		this.range = range;
	}

	public String getName() {
		return name;
	}

	public ZodiacRange getRange() {
		return range;
	}

}
