package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		System.out.println("Questao 02 - Iniciar!");

		
		Scanner Input = new Scanner(System.in);
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA < 10) {
			System.out.println("A < 10");
		} else {
			System.out.println("Numero nao valido, variavel inferior ou igual a 10");
		}
		
		if(varA + varB == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero nao valido, a somadas variaveis nao resulta em 20");
		}
		
	}

}
