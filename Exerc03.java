package com.lucasvini.list01;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		System.out.println("Questao 03 - Iniciar!");

		
		Scanner Input = new Scanner(System.in);
		System.out.println("Entre com um valor para A: ");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		int varB = Input.nextInt();
		
		Input.close();
		
		/* Apesar do código ficar mais extenso,
		 * optei por deixá-lo mais completo colocando cada caso específico nessa questão.
		 * Mais por questão de treino mesmo.
		*/
		
		if(varA == 10) {
			System.out.println("A == 10");
		} else if(varA > 10) {
			System.out.println("Numero invalido, A maior que 10");
		} else if(varA < 10) {
			System.out.println("Numero invalido, A menor que 10");
		}
		
		if(varA + varB == 20) {
			System.out.println("A + B == 20");
		} else if(varA + varB > 20) {
			System.out.println("Numero invalido, a soma das variaveis resulta em um numero maior que 20");
		} else if(varA + varB < 20) {
			System.out.println("Numero invalido, a soma das variaveis resulta em um numero menor que 20");
		}
		
		if(varB == 10) {
			System.out.println("B == 10");
		} else if(varB > 10) {
			System.out.println("Numero invalido, B maior que 10");
		} else if(varB < 10) {
			System.out.println("Numero invalido, B menor que 10");
		}
		
	}

}
