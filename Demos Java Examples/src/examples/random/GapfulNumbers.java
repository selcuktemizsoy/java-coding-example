package examples.random;

import java.util.Scanner;

public class GapfulNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number;
		System.out.println("Enter a number which you want to learn the number is gapful or not");
		number = sc.nextLong();
		int numberLong = String.valueOf(number).length();
		int numberOne = (int) (number % 10);
		int numberTwo = (int) (number /Math.pow(10, numberLong - 1));
		int division = Integer.parseInt("" + numberTwo + numberOne);
		if(number % division == 0)
			System.out.println("Gapful number");
		else
			System.out.println("It is not gapful sorry");
	}

}
