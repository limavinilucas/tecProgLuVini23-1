package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		System.out.println("Questão 13 - Iniciar!");
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para A: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10) {
			System.out.println("\nResultados:\n1. A > 10");
		} else {
			System.out.println("\nResultados:\n1. Números não válidos.");
		}
		
		if(varA + varB == 20) {
			System.out.println("\n2. A + B == 20");
		} else {
			System.out.println("\n2. Números não válidos.");
		}
		
	}

}
