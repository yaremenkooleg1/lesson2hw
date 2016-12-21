package ua.od.hillel;

	import java.util.Scanner;


public class Trianglesq{

		public static void main (String[] args){

	Scanner user_input = new Scanner ( System.in );

	double a, b, c;

	System.out.println ("ВВЕДИТЕ ДЛИНУ КАТЕТА А");

	a = user_input.nextDouble();

	System.out.println ("Введите длину катета b");

	b = user_input.nextDouble();

	c = a*b/2;

	System.out.print ("Площадь прямоугольного треугольника"+" "+ c +" см квадратных");

	}

}
