package com.lucasvini.
list01;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		
		System.out.println("Questão 14 - Iniciar!");
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Entre com dados para a variavel A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com dados para a variavel A: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10) {
			System.out.println("A > 10");
		}
		
		if(varA + varB == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Números não válidos!");
		}
		
	}

}
