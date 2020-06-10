package examples.random;

import java.util.Scanner;

public class OddSUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you will enter? :");
		int length = sc.nextInt();
		int count = 0;
		for (int i = 0; i < length; i++) {
			int temp = sc.nextInt();
			if(temp % 2 == 0)
				count += temp;
		}
		
		System.out.println(count);
		
	}

}
