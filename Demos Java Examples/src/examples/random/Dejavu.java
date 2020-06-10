package examples.random;

import java.util.Scanner;

public class Dejavu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a random text:");
		String text = sc.nextLine();
		boolean isDejavu = false;
		label1 : for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			for (int j = i + 1; j < text.length(); j ++) {
				if (ch == text.charAt(j)){
					isDejavu = true;
					break label1;
				}
			}
			
		}
		
		if(isDejavu)
			System.out.println("DEJAVU");
		else
			System.out.println("Unique great");
		
	}
}