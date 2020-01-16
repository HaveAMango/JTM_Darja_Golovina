package jtm.extra01;

public class Date {
	private int day;
	private int month;
	
	public Date(int day, int month) {
		this.day = day;
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}
	
	public boolean equal(Date other) {
		return this.day == other.day && this.month == other.month;
	}
	
	public boolean lessThan(Date other) {
		// December < January case
		if (other.month == 1 && this.month == 12) {
			return true;
		} else if (other.month == 12 && this.month == 1) {
			return false;
		}
			
		if (other.month < this.month) {
			return false;
		} else if (other.month > this.month) {
			return true;
		}
		
		return other.day > this.day;
	}
	
	public boolean lessThanOrEqual(Date other) {
		return lessThan(other) || equal(other);
	}
	
	public boolean moreThanOrEqual(Date other) {
		return !lessThan(other);
	}
}
