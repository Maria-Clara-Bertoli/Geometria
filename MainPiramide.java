package Geometria;

import java.util.Scanner;

public class MainPiramide {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Informe a altura da pir?mide: ");
		float altura = valor.nextFloat();
		
		System.out.println("Informe o raio da base da pir?mide: ");
		float raio = valor.nextFloat();
		
		System.out.println("Informe o tipo da tinta: ");
		System.out.println("Tipo 1 - R$127,90");
		System.out.println("Tipo 2 - R$258,98");
		System.out.println("Tipo 3 - R$344,34");
		int tipo = valor.nextInt();
		
		Piramide piramide = new Piramide(altura, raio, tipo);
		
		System.out.println("---------------PIR?MIDE---------------");
		System.out.println("Altura: " + piramide.getAltura());
		System.out.println("Raio: " + piramide.getRaio());
		System.out.println("Tipo: " + piramide.getTipo());
		System.out.println("--------------------------------------");
		System.out.println("?rea da base: " + piramide.areaBase());
		System.out.println("?rea do tri?ngulo: " + piramide.areaTriangulo());
		System.out.println("?rea Total: " + piramide.areaTotal());
		System.out.println("Volume: " + piramide.Volume());
		System.out.println("--------------------------------------");
		System.out.println("Quantidade de litros: " + piramide.Litros());
		System.out.println("Quantidade de latas: " + piramide.Latas());
		System.out.println("Valor Total: " + piramide.Gasto());
		
		valor.close();
	}

}
