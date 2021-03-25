package com.alumne.accions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.alumne.accions.Accions;

class AccionsTest {

	/**
	 * Aqui provarem amb un parametre no valid, en aquest cas es el ticker
	 * que hem posat no esta entre els valors esperats.
	 */
	
	@Test
	void testTickerNoValid() {
		
		int resultatActual;
		int resultatEsperat;
		
		Accions a = new Accions();
		
		resultatActual = a.registrarPreu(100.0, "AAA");
		
		resultatEsperat = -1;
		
		assertEquals(resultatEsperat, resultatActual, "S'esperava que no funciones ja que el nom de l'empresa no esta entre els valids");
		
	}
	
	/**
	 * Aqui comprovarem amb un parametre no valid, en aquest cas es el
	 * preu de l'acció. Per a un preu inferior a 0€ i en aquest cas -100.0 €
	 * retornara -2.
	 */
	
	@Test
	void testPreuNegatiuNoValid() {
		
		int resultatActual;
		int resultatEsperat;
		
		Accions a = new Accions();
		
		resultatActual = a.registrarPreu(-100.0, "AMZN");
		
		resultatEsperat = -2;
		
		assertEquals(resultatEsperat, resultatActual, "S'esperava que no funciones ja que el preu es inferior al demanat");
		
	}
	
	/**
	 * Aqui comprovarem amb un parametre no valid, en aquest cas
	 * provara el preu de l'acció 800.0€ que es superior al preu
	 * maxim que es 500€ i retornara -3.
	 */
	
	@Test
	void testPreuMajorNoValid() {
		
		int resultatActual;
		int resultatEsperat;
		
		Accions a = new Accions();
		
		resultatActual = a.registrarPreu(800.0, "AMZN");
		
		resultatEsperat = -3;
		
		assertEquals(resultatEsperat, resultatActual, "S'esperava que no funciones ja que el preu es major al demanat");
		
	}
	
	/**
	 * Aqui comprovarem amb tots el parametres valid i al final
	 * retornara 0.
	 */
	
	@Test
	void testCorrecte() {
		
		int resultatActual;
		int resultatEsperat;
		
		Accions a = new Accions();
		
		resultatActual = a.registrarPreu(100.0, "AMZN");
		
		resultatEsperat = 0;
		
		assertEquals(resultatEsperat, resultatActual, "S'esperava que funciones tot correctament");
		
	}
	
}
