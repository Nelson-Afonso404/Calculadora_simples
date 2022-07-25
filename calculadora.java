package main;

import java.util.Scanner;

public class calculadora {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		System.out.println("---------------calculadora-------------------");
		System.out.println("---------------------------------------------");
		System.out.println(" Escolha o primeiro valor: ");
		int a = input.nextInt();
		System.out.println(" Escolha o segundo valor: ");
		int b = input.nextInt();
		
		System.out.println("escolha a operação: "
				+ "\n(1) SOMA"
				+ "\n(2) SUBTRAÇÃO"
				+ "\n(3) MULTIPLICAÇÃO"
				+ "\n(4) DIVISÃO");
		int operacao = input.nextInt();
		switch (operacao) {
		case 1:
			Operacoes.soma(a,b);
			break;
		case 2:
			Operacoes.subtracao(a,b);
			break;
		case 3:
			Operacoes.multiplicacao(a,b);
			break;
		case 4:
			Operacoes.divisao(a,b);
			break;
		}
		
	}

}
