package org.booleancarrers.java;

public class FizzBuzz {

	public static void main(String[] args) {
		
		/* Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi “Fizz” al posto del numero e per i multipli di 5 stampi Buzz. 
		Per i numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz. */
		
		int[] numeri = new int[100];
		
		for(int i = 0; i < numeri.length; i++) {
			
			numeri[i] = i+1;
		}
		
		for(int i = 0; i < numeri.length; i++) {
			
			int value = numeri[i];
			if (((value % 3) == 0) && ((value % 5) == 0)){
				System.out.println("FizzBuzz");
			}else if((value % 5) == 0) {
				System.out.println("Buzz");
			}else if((value % 3) == 0){				
				System.out.println("Fizz");
			}else {
				System.out.println(value);
			}
		}
	}
}
