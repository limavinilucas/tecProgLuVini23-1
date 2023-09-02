package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		System.out.println("Questao 04 - Iniciar!");
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10 || varA + varB == 20) {
			System.out.println("Numero valido");
		} else if(varA == varB) {
			System.out.println("A igual a B; A e B sao diferentes de 10; A menor que 10");
		} else {
			System.out.println("Numero nao valido");
		}
		
	}

}
