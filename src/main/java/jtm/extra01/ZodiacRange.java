package jtm.extra01;

public class ZodiacRange {

	private Date from;
	private Date to;
	
	public ZodiacRange(Date from, Date to) {
		this.from = from;
		this.to = to;
	}

	public Date getFrom() {
		return from;
	}

	public Date getTo() {
		return to;
	}
	
	public boolean matches(Date date) {
		return date.moreThanOrEqual(from) && date.lessThanOrEqual(to);
	}

}
