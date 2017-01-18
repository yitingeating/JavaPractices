package studio8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Calendar {
    private HashSet <Appointment> set=new HashSet();
    public void addAppointment(Appointment app){
    	this.set.add(app);
    }
    boolean isConflict(Date date,Time time){
    	Appointment event=new Appointment(date,time);
    	Iterator <Appointment> i=set.iterator();
    	while(i.hasNext()){
    		Appointment next=i.next();
    		if(event.equals(next))
    			return true;
    		break;
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1=new Date(6,2013,22);
		Date date2=new Date(6,2013,25);
		Time time1=new Time(12,15);
		Time time2=new Time(7,15);
		Time time3=new Time(3,16);
		Appointment app1=new Appointment (date1,time1);
		Appointment app2=new Appointment (date1,time1);
		Calendar myCalendar=new Calendar();
		myCalendar.addAppointment(app1);
		myCalendar.addAppointment(app2);
		System.out.println(myCalendar.isConflict(date1, time3));
	}

}
