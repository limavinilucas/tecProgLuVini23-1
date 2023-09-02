package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		System.out.println("Questao 06 - Iniciar!");
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		if(varA > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		
		if(varA + varB == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
		
	}

}
