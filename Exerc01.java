package com.lucasvini.list01;

import java.util.Scanner;	// Importando o pacote de funções que contém o Scanner (Entrada de dados pelo teclado)

public class Exerc01 {

	public static void main(String[] args) {
		
		System.out.println("Questao 01 - Iniciar!");	// Apenas para fins estéticos e organizacionais optei por colocar isso em todos os códigos.

		
		Scanner Input = new Scanner(System.in);		// Abertura do Scanner nomeado como "Input" (Referenciando a entrada de dados em inglês)
		System.out.println("Entre com um valor A:");
		int varA = Input.nextInt();
		
		System.out.println("Entre com um valor B:");
		int varB = Input.nextInt();
		
		Input.close();	// Fecha o Scanner "Input", fazendo com que, assim, não ocorra nenhum erro ou entrada de dados excedente pelo teclado
		
		System.out.println("Valor de A: " + varA);
		System.out.println("Valor de B: " + varB);
		
		if(varA > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("numero nao valido");
		}
		
		if(varA + varB == 20) {
			System.out.println("A + B == 20");
		} else if(varA + varB != 20) {
			System.out.println("numero nao valido");
		}

	}

}
