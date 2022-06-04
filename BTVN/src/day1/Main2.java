package day1;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
//		Bai2();
//		Bai3();
		Bai4();
	}

	private static void Bai2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input distance in meters: ");
		double meter = sc.nextDouble();

		System.out.println("Input hour: ");
		int hour = sc.nextInt();

		System.out.println("Input minute: ");
		int minute = sc.nextInt();

		System.out.println("Input second: ");
		int second = sc.nextInt();

		float ms = (float) (meter / (hour * 60 * 60 + minute * 60 + second));
		float kh = (float) (meter / 1000 / (hour + minute / 60.0 + second / 3600.0));
		float mh = (float) (meter / 1609 / (hour + minute / 60.0 + second / 3600.0));

		System.out.println("Your speed in meters/second is: " + ms);
		System.out.println("Your speed in km/h is: " + kh);
		System.out.println("Your speed in miles/h is: " + mh);

		sc.close();
	}

	private static void Bai3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input 1st integer: ");
		int a = sc.nextInt();

		System.out.println("Input 2nd integer: ");
		int b = sc.nextInt();

		int max = a < b ? b : a;
		int min = a < b ? a : b;

		System.out.println("Sum of two integers: " + (a + b));
		System.out.println("Difference of two integers: " + (a - b));
		System.out.println("Product of two integers: " + (a * b));
		System.out.println("Average of two integers: " + (a + b) / 2.0);
		System.out.println("Distance of two integers: " + (max - min));
		System.out.println("Max integer: " + max);
		System.out.println("Max integer: " + min);
	}

	private static void Bai4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input six non-negative digits: ");

		int number = sc.nextInt();
		int digit1 = number / 100000 % 10;
		int digit2 = number / 10000 % 10;
		int digit3 = number / 1000 % 10;
		int digit4 = number / 100 % 10;
		int digit5 = number / 10 % 10;
		int digit6 = number % 10;

		System.out.println(digit1 + "," + digit2 + "," + digit3 + "," + digit4 + "," + digit5 + "," + digit6); 
	}

}
