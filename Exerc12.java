package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		System.out.println("Questão 12 - Iniciar!");
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10) {
			System.out.println("A maior que 10");
		} else if (varA + varB == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Números não válidos");
		}
		
		System.out.println("\nSejam bem-vindos à disciplina de Técnicas de Programação.");
		
	}

}
