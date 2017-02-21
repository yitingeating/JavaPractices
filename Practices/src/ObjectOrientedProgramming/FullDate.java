package ObjectOrientedProgramming;

//public class FullDate {
	
//}

public class FullDate extends SimpleDate {
	private int year;
	public int mon;
	public int day;
	//public SimpleDate(){
	
	//}
	
	
	public FullDate(int year, int month, int day) {
		super(month, day);
		this.year = year;
		this.mon = month;
		this.day = day;
	}
	public FullDate(FullDate date) {
		super(date);
		year = date.year;
		mon = date.mon;
		day = date.day;
	}
	public boolean lessOrEqual(FullDate date) {
		if (year < date.year)
			return true;
		else if (mon < date.mon && year == date.year)
			return true;
		else if (day <= date.day && mon == date.mon && year == date.year)
			return true;
		else
			return false;
	}
	public int getYear() {
		return year;
	}

    public String toString() {
    	return year + "/" + mon + "/" + day;
    }
    public boolean equals(FullDate d) {
    	if (mon == d.getMonth() && day == d.getDay() && year == d.getYear()) {
			  return true;  
		  }
		  else 
			  return false;  
    }
    public void nextDay() {
      if ((day == 31) && (mon != 12)) {
  		  day = 1;
  	      mon++;
  	      }
  	  if (day == 30 && (mon == 4 || mon == 6 || mon == 9 || mon == 11)) {
  		  day = 1;
  		  mon++;
  	  }
  	  if (day == 31 && mon == 12) {
  		  day = 1;
  		  mon = 1;
  		  year++;
  	  }
  	  if (day == 28 && mon == 2 && year%4 != 0) {
  		  day = 1;
  		  mon++;
  	  }
  	  if (day == 28 && mon == 2 && year%400 == 0) {
  		  day++;
  	  }
  	  if (day == 28 && mon == 2 && year%100 == 0 && year%400 != 0) {
  		  day = 1;
  		  mon++;
  	  }
  	  if (day == 28 && mon == 2 && year%100 != 0 && year%4 == 0) {
  		  day++;
  	  }
  	  if (day == 29 && mon == 2) {
  		  day = 1;
  		  mon++;
  	  }
  	  else {
  		  day++;
  	  }
    }
    
    }


