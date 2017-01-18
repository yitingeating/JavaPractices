package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + (isHoliday ? 1231 : 1237);
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (isHoliday != other.isHoliday)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public Date(int month, int year, int day) {
		super();
		this.month = month;
		this.year = year;
		this.day = day;
		this.isHoliday=false;
	}


	private final int month;
	private final int year;
	private final int day;
	boolean  isHoliday;
	
	
	
	public static void main(String[] args) {
		Date date1=new Date(6,2013,22);
		Date date2=new Date(6,2013,25);
		Date date3=new Date(5,2012,15);
		Date date4=new Date(11,1997,7);
		Date date5=new Date(3,1985,7);
		Date date6=new Date(3,1985,7);
		LinkedList <Date> list=new LinkedList <Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
		list.add(date6);
		HashSet<Date> set=new HashSet<Date>();
		set.add(date5);
		set.add(date6);
		//set.add(date4);
		System.out.println(list);
		System.out.println(set);
		System.out.println(date1.equals(date2));
		
	}

}
