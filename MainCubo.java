package Geometria;

import java.util.Scanner;

public class MainCubo {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Informe o lado do cubo: ");
		float lado = valor.nextFloat();
		
		System.out.println("Informe o rendimento da tinta e metros quadrados por litro: ");
		float rendimento = valor.nextFloat();
		
		System.out.println("Informe o tipo da tinta: ");
		System.out.println("Tipo 1 - R$101,90");
		System.out.println("Tipo 2 - R$212,45");
		System.out.println("Tipo 3 - R$345,56");
		int tipo = valor.nextInt();
		
		Cubo cubo = new Cubo(lado, rendimento, tipo);
		
		System.out.println("---------------CUBO---------------");
		System.out.println("Área total do cubo: " + cubo.areaTotal());
		System.out.println("----------------------------------");
		System.out.println("Quantidade de litros: " + cubo.Litros());
		System.out.println("Quantidade de latas: " + cubo.Latas());
		System.out.println("----------------------------------");
		System.out.println("Valor a pagar: " + cubo.Gasto());
		
		valor.close();

	}

}
