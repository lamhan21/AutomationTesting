package day1;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
//		Bai1();
		Bai2();
//		Bai3();
//		Bai4();
//		Bai6();
//		Bai7();
	}

	private static void Bai1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a keyword:");
		String str = sc.nextLine();

		System.out.println("Kqua = " + str);

		sc.close();
	}

	private static void Bai2() {
		System.out.println("++++++");
		System.out.println("@@@@@@");
		System.out.println("******");
		System.out.println("######");
	}
	
	private static void Bai3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		float b = sc.nextFloat();

		System.out.println("Enter c:");
		double c = sc.nextDouble();

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		sc.close();

	}

	private static void Bai4() {
		Boolean isValid = true;

		System.out.println("Before: " + isValid);

		isValid = false;

		System.out.println("After: " + isValid);

	}

	private static void Bai6() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input a degree in Fahrenheit: ");

		double f = sc.nextDouble();
		double c;
		c = (f - 32) * 5 / 9;

		System.out.println(f + " degree Fahrenheit is equal to " + c + " in Celsius");

		sc.close();
	}

	private static void Bai7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input a value for inch: ");

		double inch = sc.nextDouble();
		
		double meter = inch * 0.0254;

		System.out.println(inch + " inch is " + meter + " meters");

		sc.close();
	}

}
