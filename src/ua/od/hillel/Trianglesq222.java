package ua.od.hillel;

	import java.util.Scanner;


public class Trianglesq{

		public static void main (String[] args){

	Scanner user_input = new Scanner ( System.in );

	double a, b, c;

	System.out.println ("������� ����� ������ �");

	a = user_input.nextDouble();

	System.out.println ("������� ����� ������ b");

	b = user_input.nextDouble();

	c = a*b/2;

	System.out.print ("������� �������������� ������������"+" "+ c +" �� ���������� );

	}

}
