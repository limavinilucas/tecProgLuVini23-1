package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		
		System.out.println("Questão 20 - Iniciar!");
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10 || varA + varB == 20) {
			System.out.println("Números válidos.");
		} else System.out.println("Números não válidos.");
		
		System.out.println("\nSejam bem-vindos à disciplina de Técnicas de Programação.");
		
	}

}
