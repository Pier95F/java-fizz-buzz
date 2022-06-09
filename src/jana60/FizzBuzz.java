package jana60;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		// Chiedo all'utente di inserire un numero 
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci numero");
		int numero = scan.nextInt();
		
		// Se il numero scelto è maggiore di 100
		if (numero>100) {
		// Messaggio di errore
			System.out.println("Error: inserisci un numero compreso tra 1 e 100");
		} 
		
		// Se il numero scelto è compreso tra 1 e 100
		if (numero>0 && numero <=100) {
		// Inizio il gioco
		System.out.println("Inizia il gioco");
		// Imposto il ciclo
		for (int i=numero; i <=100; i++) {
		// se il numero è divisibile per 3 e per 5
			if (i % 3 == 0 && i % 5 == 0) { 
		// stampa FizzBuzz
				System.out.println("FizzBuzz"); 
		// se il numero è divisibile solo per 3
			} else if (i % 3 == 0) { 
		// stampa Fizz
				System.out.println("Fizz");
		// se il numero è divisibile solo per 5
			} else if (i % 5 == 0) {
		// stampa Buzz
				System.out.println("Buzz");
		// se il numero non rispetta queste condizioni
			} else {
		// stampa il numero 
				System.out.println(i);
			}
		}
		}
		
		scan.close();

	}

}
