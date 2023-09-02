package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		System.out.println("Questao 05 - Iniciar!");

		Scanner Input = new Scanner(System.in);
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10 || varA + varB == 20) {
			System.out.println("Numero valido");
		} else {
			System.out.println("Numero nao valido");
		}

	}

}
