package Geometria;

import java.util.Scanner;

public class MainCone {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Informe a altura do cone: ");
		float altura = valor.nextFloat();
		
		System.out.println("Informe o raio do cone: ");
		float raio = valor.nextFloat();
		
		System.out.println("Informe o tipo da tinta: ");
		System.out.println("Tipo 1 - R$238,90");
		System.out.println("Tipo 2 - R$467,98");
		System.out.println("Tipo 3 - R$758,34");
		int tipo = valor.nextInt();
		
		Cone cone = new Cone(altura, raio, tipo);
		
		System.out.println("---------------CONE---------------");
		System.out.println("Raio: " + cone.getRaio());
		System.out.println("Altura: " + cone.getAltura());
		System.out.println("Tipo: " + cone.getTipo());
		System.out.println("----------------------------------");
		System.out.println("Geratriz: " + cone.Pitagoras());
		System.out.println("----------------------------------");
		System.out.println("Área do fundo do cone: " + cone.areaFundo());
		System.out.println("Área da lateral do cone: " + cone.areaLateral());
		System.out.println("Área total do cone: " + cone.areaTotal());
		System.out.println("----------------------------------");
		System.out.println("Quantidade de litros: " + cone.Litros());
		System.out.println("Quantidade de latas: " + cone.Latas());
		System.out.println("----------------------------------");
		System.out.println("Valor a pagar: " + cone.Gasto());
		
		valor.close();
	}
}
