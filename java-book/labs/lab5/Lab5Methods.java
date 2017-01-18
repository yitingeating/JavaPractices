package lab5;

import studio5.Methods;

// Name:Shiyao Liu
//the class offers several methods that could be tested in the Lab5Tester.java file

public class Lab5Methods {

	
/**
 * Given two positive integers j and k ,return the product of them without using "*"
 * REQUIERES:the two integers are both positive 
 * @param j:the first integer
 * @param k:the second integer
 * @return product:the product of the two inputs
 */
static int multPos(int j,int k){
	int product=0;
	for(int i=0;i<k;i++)
		product+=j;
	return product;
}

/**
 * Given two integers with no limitation, return the product
 * REQUIERES:nothing
 * @param j:the first integer
 * @param k:the second integer
 * @return product:the product of the two inputs
 */
static int mult(int j,int k){
	int product=0;
	if(j>=0&&k>=0){
		product=multPos(j,k);
	} else if(j<=0&&k<=0){
		j=-j;
		k=-k;//turn j and k to positive 
		product=multPos(j,k);
	} else if(j<=0&&k>=0){
		j=-j;
		product=-multPos(j,k);
	} else {
		k=-k;
		product=-multPos(j,k);
	}
	return product;
}

/**
 * Given two integers,calculate the value of j to the power k
 * REQUIRES:k should be a non-negative number
 * @param j:the base number
 * @param k:the power number,need to be non-negative
 * @return exponential:the value of j to the power k;
 */
static int expt(int j,int k){
	int exponential=1;
	for(int i=0;i<k;i++)
		exponential=mult(exponential,j);
	return exponential;
}

/**
 * Given a string, determine whether it is a palindrome
 * @param s:the string need to be tested
 * @return: a boolean to see if this is a palindrome
 */
static boolean isPalindrome(String s){
	String checkString="";
	int length=s.length();
	for(int i=length-1;i>=0;i--)
		checkString+=s.charAt(i);
	return s.equals(checkString);
}

/**
 * provide the fibonacci with given  number
 * REQUIRE:n should be positive
 * @param n:how many numbers in the serie
 * @return an array which is the fibonacci serie
 */
static int[] fibonacci(int n){
	int []fibonacciSerie=new int[n];
    for(int i=0;i<n;i++){
    	fibonacciSerie[0]=1;
    	if(i>=1)
    	fibonacciSerie[1]=1;
    	if(i>=2){
    		fibonacciSerie[i]=fibonacciSerie[i-1]+fibonacciSerie[i-2];
    	}
    }
    return fibonacciSerie;	
}

/**
 * Calculate the showed score
 * @param labs
 * @param quizzes
 * @param exams
 * @param studios
 * @param extension
 * @return A string showing the result
 */
static String computeGrade(double[] labs,double[] quizzes, double[] exams, boolean studios,int extension){
	double grade=0;
	String show;
	double aveLab=Methods.average(labs);
    double sumQuiz=0;
    double min=100;
    for(int i=0;i<quizzes.length;i++){
    	sumQuiz+=quizzes[i];
    	if(quizzes[i]<min)
    		min=quizzes[i];
    }
    sumQuiz=sumQuiz-min;
    double aveQuiz=sumQuiz/(quizzes.length);

	//double aveQuiz=Methods.average(quizzes);
	double aveExam=Methods.average(exams);
	double studio;
	if(studios==true)
		studio=100;
	else
		studio=0;
	
   grade+=0.1*studio+0.15*aveLab+0.2*extension+0.45*aveExam+0.1*aveQuiz;
	System.out.println(studio+" "+aveLab+" "+extension+" "+aveExam+" "+aveQuiz);
	if(grade<=100&grade>=97)
		show="A+";
	else if(grade>=93)
		show="A";
	else if(grade>=90)
		show="A-";
	else if(grade>=87)
		show="B+";
	else if(grade>=83)
		show="B";
	else if(grade>=80)
		show="B-";
	else if(grade>=77)
		show="C+";
	else if(grade>=73)
		show="C";
	else if(grade>=70)
		show="C-";
	else if(grade>=60)
		show="D";
	else
		show="F";
	
	return show;
	
	
}
}
