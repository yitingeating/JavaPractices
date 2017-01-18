package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public String name;
	//public double carbs;
	public double fat;
	public double protein;
	public double statedCals;

	public static void main(String args[]){
		ArgsProcessor ap=new ArgsProcessor(args);
		String name= ap.nextString("The name of the food:");
		double carbs=ap.nextDouble("How much grams of carbohydrages");
		double fat=ap.nextDouble("How much fat are there:");
		double protein=ap.nextDouble("How much protein are there:");
		double statedCals=ap.nextDouble("How much is the stated calories on the label?:");
		
		//TODO
		/**
		 * 请在下面编写你的代码。
		 * 在上卖弄的语句中， carbs, fat, protein和statedCals都是你输入的变量。根据这些变量请计算如下数据
		 * 
		 */
		double calories;
		calories=4*carbs+4*protein+9*fat;
		double extra=calories-statedCals;
		extra=10*extra;
		extra=Math.round(extra);
		extra=extra/10;
		//extra=Math.round(extra*10)/10;
		double perc=((double)4*carbs)/statedCals;
		perc=1000*perc;
		perc=Math.round(perc);
		perc=perc/10;
		double perf=((double)9*fat)/statedCals;
		perf=1000*perf;
		perf=Math.round(perf);
		perf=perf/10;
		double perp=((double)4*protein)/statedCals;
		perp=1000*perp;
		perp=Math.round(perp);
		perp=perp/10;
		fat=10*fat;
		fat=Math.round(fat);
		fat=fat/10;



		System.out.println(name+" has:");
		System.out.println("  "+carbs+" grams of carbohydrates = "+ (double)4*carbs+" "+"Calories");
		System.out.println("  "+fat+" grams of fat = "+ 9*fat+" "+"Calories");
		System.out.println("  "+protein+" grams of protein = "+ (double)4*protein+" "+"Calories");
		System.out.println("\n"+"This food is said to have "+statedCals+" (available) Colories.");
		System.out.println("with "+extra+" unavailable Colories, this food has "+extra/4+" grams of fiber");
		System.out.println("\n"+"Approximately");
		System.out.println("  "+perc+"%"+" of your food is carbohydrates");
		System.out.println("  "+perf+"%"+" of your food is fat");
		System.out.println("  "+perp+"%"+" of your food is protein");

		boolean lcarb=(perc<=25);
		boolean lfat=(perf<=14);
		System.out.println("\n"+"This food is acceptable for a low-carb diet?  "+lcarb);
		System.out.println("This food is acceptable for a low-fat diet?  "+lfat);
		double head=Math.random();
		System.out.println("By coin flip, you should eat this food?   "+(head>=0.5));









		//System.out.println(carbs);

	}

}
