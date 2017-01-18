package studio8;

public class Appointment {
    @Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}


	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Appointment other = (Appointment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}


	private final Date date;
    private final Time time;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1=new Date(6,2013,22);
		Date date2=new Date(6,2013,25);
		Time time1=new Time(12,15);
		Time time2=new Time(7,15);
		Appointment app1=new Appointment (date1,time1);
		Appointment app2=new Appointment (date1,time1);
		System.out.println(app1.equals(app2));
	}

}
