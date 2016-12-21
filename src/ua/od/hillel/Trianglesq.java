package ua.od.hillel;

	import java.util.Scanner;


public class Trianglesq{

		public static void main (String[] args){

	Scanner user_input = new Scanner ( System.in );

	double a, b, c;

	System.out.println ("¬ведите длину катета а");

	a = user_input.nextDouble();

	System.out.println ("¬ведите длину катета b");

	b = user_input.nextDouble();

	c = a*b/2;

	System.out.print ("ѕлощадь пр€моугольного треугольника"+" "+ c +" см квадратных");
	
	}

}