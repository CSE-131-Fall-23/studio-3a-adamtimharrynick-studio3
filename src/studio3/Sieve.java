package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the upper limit?");
		int n = in.nextInt();
		
		int i = 2;
		boolean[] primeNumbers = new boolean[n];
		for (i = 0; i < n; i++)
	     {
	         primeNumbers[i] = true;
	     }
		
		for(i = 2; i < Math.sqrt(n); i++) {
			if(primeNumbers[i] == true) {
				
				for(int j = i*2; j < primeNumbers.length; j =+ i) {
					primeNumbers[j] = false;
				
					}
				}
			
			}
		for(i = 2; i < n; i++) {
			if(primeNumbers[i] == true) {
				System.out.println(primeNumbers[i]);
				}
			}
	}

}
