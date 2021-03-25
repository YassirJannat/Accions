package com.alumne.accions;

public class Accions {
	
	/**
	 * Aquest metode comprovara que els noms de la empresa concideixen amb el de la Array i
	 * que els preus estiguin entre el preu minim i el preu maxim.
	 * Si el nom de l'empresa no es un dels que esta a l'array retornara un -1.
	 * Si el preu de l'accio es inferior a 0 retornara un -2 i si es superior
	 * retornara un -3.
	 * Al final si les dades estan correctes mostrar els paremetres.
	 */
	
	public int registrarPreu(double preu, String ticker) {
	 
		//Si fora real guardaria a la base de dades el nom de l'empresa i el valor de l'acció
		//però com es tracta d'una prova només els mostra per pantalla.
		
		String tickersValids = "AAPL AMZN FB GOOGL";
			
		int comparacio = tickersValids.indexOf(ticker);
		if (comparacio == -1) {
				
			System.out.println("El ticker no és vàlid");
				
			return -1;
		}
			
		if (preu<0.0) {
				
			System.out.println("El preu és menor que el valor mínim permés");
				
			return -2;
				
		}
			
		if (preu>500.0) {
				
			System.out.println("El preu és superior al valor màxim permés");
			return -3;
		}
		
			
		System.out.println("Valors registrats, ticker: " + ticker + ", preu: " + preu);
		return 0;
	}
	
	/**
	 * Aquest metode retornara el preu més alt pero en aquest cas retornara un valor que ja esta assignat
	 */
	
	public double preuMax(){
		//Un programa real es connectaria a una base de dades per a mirar el preu més alt
		//com és per a una prova ràpida mostra un valor predeterminat
		return 455.0;
	}
	
	/**
	 * Aquest metode retornara l'empresa amb el preu més alt pero en aquest cas retornara un valor ja assignat
	 */
	
	public String tickerMax() {
		//Un programa real es connectaria a una base de dades per a mirar l'empresa amb el preu més alt
		//com és per a una prova ràpida mostra un valor predeterminat
		return "AAPL";
	}
		
	/**
	 * Aquest metode en retornaria el preu minim pero en aquest cas retornara un valor ja assignat
	 */
	
	public double preuMin() {
		//Igual per als valors mínims
		return 150.0;
	}
	
	/**
	 * Aquest metode retornara l'empresa amb el preu més baix pero en aquest cas retornara un valor ja assignat
	 */
	
	public String tickerMin() {
		//Igual per als valors mínims
		return "FB";
	}
		
}
