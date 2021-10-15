package es.Studium.dividir;

import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numerador, denominador;
		float resultado;
		System.out.println("Dame un numero entero ");
		numerador = teclado.nextInt();
		System.out.println("Ingrese otro numero entero ");
		denominador = teclado.nextInt();
		resultado=dividir(numerador,denominador);
		System.out.println("El resultado es " + resultado);
		teclado.close();
	}
	public static float dividir(int a, int b)
	{
		float resultado;
		resultado =(float) a/ (float) b;
		return(resultado);
	}
}
