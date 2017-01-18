package lab7;
//Shiyao Liu, ID:437742
public class Course {
	String name;
	int credits;
	int seats;
	int remainingSeats;
	Student []roster;
	
	public Course(String n,int c,int s){
		name=n;
		credits=c;
		seats=s;
		remainingSeats=seats;
		roster=new Student[seats];
	}
	/**
	 * get the remaining seats
	 * @return
	 */
	public int getRemainingSeats(){
		return remainingSeats;
	}
	
	/**
	 * get the name of the course
	 * @return
	 */
	public String getName(){
		return name;
	}
	/**
	 * return the course's name and credits
	 */
	public String toString(){
		return name+" "+credits;
	}
	
	/**
	 * add an student to the roster
	 * @param newGuy
	 * @return
	 */
	public boolean addStudent(Student newGuy){
		if(remainingSeats==0)
			return false;
		else{
			roster[seats-remainingSeats]=newGuy;
			remainingSeats--;
			return true;
		}
	}
	
	/**
	 * computer the average GPA
	 * @return
	 */
	public double averageGPA(){
		double totGPA=0.0;
		if(remainingSeats==seats)
			return 0.0;
		else{
			for(int i=0;i<(seats-remainingSeats);i++){ //this will guarantee the roster is in-order
				totGPA+=roster[i].GPA;
			}
		}
		return totGPA/(seats-remainingSeats);
	}
	
	/**
	 * this method will print out the roster
	 */
	public void printRoster(){
		if(remainingSeats==0)
			return;
		else{
			for(int i=0;i<(seats-remainingSeats);i++){
				System.out.println(roster[i].getName()+" "+roster[i].getStudentID());
			}
		}
	}
	
	public static void main(String []args){
		Course Soccer=new Course("Soccer",3,30);
		Student Owen=new Student("Michael","Owen",520100);
		Student Beckham=new Student("David","Beckham",520101);
		Student Scholes=new Student("Paul","Scholes",520001);
		Soccer.addStudent( Owen);
		Soccer.addStudent(Beckham);
		Soccer.addStudent(Scholes);
		Soccer.printRoster();

	}
}
