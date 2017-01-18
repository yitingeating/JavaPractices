package studio8;

public class Time {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	
	private final int hour;
	private final int minute;
	
	public String toString(){
		int h12=hour>12?hour-12:hour;
		return "24-format "+hour+":"+minute+"\n "+"12-format "+h12+":"+minute;
	}
	public boolean isEarlierThan(Time other){
		if(other.hour<this.hour)
			return true;
		else if(other.hour>this.hour)
			return false;
		else if(other.minute<this.minute)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		Time time1=new Time(12,15);
		Time time2=new Time(7,15);
		System.out.println(time1.toString());
		System.out.println(time2.equals(time1));
	}

}
