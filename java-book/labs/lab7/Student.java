package lab7;

public class Student {
<<<<<<< .mine
String firstName;
String lastName;
int  studentID;
int credits;
double GPA;

public Student(String fName,String lName,int ID){
	firstName=fName;
	lastName=lName;
	studentID=ID;
	credits=0;
	GPA=0.0;
}
public String toString(){
	return firstName+" "+lastName+":"+studentID;
}
public String getName(){
	return firstName+" "+lastName;
}
public int getStudentID(){
	return studentID;
}
public double getGPA(){
	return GPA;
}
public int getCredits(){
	return credits;
}
public String getClassStanding(){
	if(credits>90)
		return "Senior";
	else if(credits >60)
		return "Junior";
	else if(credits>30)
		return "Sophomore";
	else
		return "Freshman";
}
public boolean isGraduated(){
	return credits>=120;
}
public boolean hasHigherAverage(Student other){
	return this.GPA>other.GPA;
}
public double submitGrade(double grade,int credit){
	double total=GPA*credits+grade*credit;
	credits+=credit;
	double newGPA=total/(credits);
	newGPA=Math.round(1000*newGPA)/1000;
	System.out.println(newGPA);
	return newGPA;
			
}
=======
String firstName;
String lastName;
int  studentID;
int credits;
double GPA;

public Student(String fName,String lName,int ID){
	firstName=fName;
	lastName=lName;
	studentID=ID;
	credits=0;
	GPA=0.0;
}
public String toString(){
	return firstName+" "+lastName+":"+studentID;
}
public String getName(){
	return firstName+" "+lastName;
}
public int getStudentID(){
	return studentID;
}
public double getGPA(){
	return GPA;
}
public int getCredits(){
	return credits;
>>>>>>> .r84
}
public String getClassStanding(){
	if(credits>90)
		return "Senior";
	else if(credits >60)
		return "Junior";
	else if(credits>30)
		return "Sophomore";
	else
		return "Freshman";
}
public boolean isGraduated(){
	return credits>=120;
}
public boolean hasHigherAverage(Student other){
	return this.GPA>other.GPA;
}
public double submitGrade(double grade,int credit){
	double total=GPA*credits+grade*credit;
	credits+=credit;
	double newGPA=total/(credits);
	newGPA=Math.round(1000*newGPA)/1000;
	System.out.println(newGPA);
	return newGPA;
			
}
}