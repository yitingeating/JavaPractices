package ex1_4;
import cse131.ArgsProcessor;
public class ex1_4 {
	
public static void main(String[] args){
	ArgsProcessor ap=new ArgsProcessor(args);
	double prob=ap.nextDouble("Input the value of probability that a gamer will succeed");
	prob=(prob<0||prob>1)?0:prob;
	double salary=110000+50000*Math.random();
	salary=2*Math.sqrt(salary);
	salary=(int)salary;
	double exp=prob*190000+(1-prob)*5000;
	exp=3*Math.sqrt(exp);
    exp=(int)exp;
	System.out.println("Gamer's expectation: "+exp);
	System.out.println("Programmer's salary:"+salary);
	boolean choice=(exp>=salary);
	System.out.println("You should be a gamer and not a programmer?"+choice);
}
}

