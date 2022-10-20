package Geometria;

import java.util.Scanner;

public class MainPiramide {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Informe a altura da pirâmide: ");
		float altura = valor.nextFloat();
		
		System.out.println("Informe o raio da base da pirâmide: ");
		float raio = valor.nextFloat();
		
		System.out.println("Informe o tipo da tinta: ");
		System.out.println("Tipo 1 - R$127,90");
		System.out.println("Tipo 2 - R$258,98");
		System.out.println("Tipo 3 - R$344,34");
		int tipo = valor.nextInt();
		
		valor.close();
	}

}
