package day1;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
//		Bai1();
		Bai2();

	}

	private static void Bai1() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;

		do {
			System.out.println("Input an integer between 0 and 1000: ");
			a = sc.nextInt();
			sc.nextLine();

			if (a < 0 || a > 1000) {
				System.out.println("Input Error");

			}
		} while (a < 0 || a > 1000);

		while (a > 0) {
			sum += a % 10;
			a /= 10;
		}

		System.out.println("Sum = " + sum);

		sc.close();
	}

	private static void Bai2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the number of minutes: ");

		long minutes = sc.nextLong();

		long day = minutes / (60 * 24);

		long year = day / 365;

		System.out.println(minutes + " minutes is approximately " + year + " years and " + (day - year * 365) + " days");
	}

}
