package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		System.out.println("Questão 10 - Iniciar!");
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10) {
			System.out.println("Numero maior que 10");
		} else {
			System.out.println("Numero menor que 10");
		}
		
		if(varA + varB == 20) {
			System.out.println("Numero igual a 20");
		} else {
			System.out.println("Numero diferente de 20");
		}

	}
}