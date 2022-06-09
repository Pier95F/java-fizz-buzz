package jana60;

import java.util.Scanner;

public class FizzBuzzBonus {

	public static void main(String[] args) {
		
		// Imposto le variabili
		Scanner scan = new Scanner(System.in);
		boolean chiediAncora = true;
		int numero = 0;
		
		// Chiedo di inserire il numero all'utente
		while (chiediAncora) {
			System.out.println("Inserisci un numero tra 1 e 200");
			numero = scan.nextInt();
	    // Verifico che il numero sia corretto
			if (numero >0 && numero <=200) {
		// Se il numero è corretto 
				System.out.println("Inizia il gioco :");
				chiediAncora=false;
		// Se il numero è sbagliato restituisco messaggio di errore
			} else {
			System.out.println("Error : inserisci nuovo numero");
			}
		 }
	 
			
		// Imposto il ciclo per il numero corretto
			for (int i = 1; i <= numero; i++) {								
					if (i % 3 == 0 && i % 5 == 0) { 				
						System.out.println("FizzBuzz"); 				
					} else if (i % 3 == 0) { 				
						System.out.println("Fizz");				
					} else if (i % 5 == 0) {				
						System.out.println("Buzz");				
					} else {			
						System.out.println(i);
						}
			}
		
	scan.close();	
	}
	 
	}

