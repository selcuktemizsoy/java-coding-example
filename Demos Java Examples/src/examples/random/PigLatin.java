package examples.random;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String [] wordArray = text.split(" ");
		for(String i : wordArray) {
			i = i.substring(1) + i.charAt(0) + "ay";
			System.out.print(i + " ");
		}
		
	}

}
