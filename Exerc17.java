package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		System.out.println("Questão 17 - Iniciar!");
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10 || varA + varB == 20) {
			System.out.println("Número válido.");
		} else if(varA == varB) {
			System.out.println("A é igual a B.");
			if(varA != 10 && varA < 10) {	// Confirma que A == B, portanto se A != 10, B != 10.
				System.out.println("A é menor que 10.");
			} else System.out.println("A/B são iguais a 10 e/ou A é maior que 10.");
		} else System.out.println("Número não válido.");
		
	}

}
