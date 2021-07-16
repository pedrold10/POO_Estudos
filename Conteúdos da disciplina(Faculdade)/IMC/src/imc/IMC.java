package imc;

import java.util.Scanner;

public class IMC {
public static void main(String[] args) {
	Scanner pessoa = new Scanner(System.in);
	System.out.println("Qual seu nome?");
	String nome = pessoa.nextLine();
	System.out.println("Qual seu peso?");
	double peso = pessoa.nextDouble();
	System.out.println("Qual sua altura?");
	double altura = pessoa.nextDouble();
	double imc = peso/(altura*altura);
		System.out.printf("Seu IMC é de: "+"%.1f",imc);
		System.out.println("");
		if (imc <= 18.5)
			System.out.println(nome+" você está abaixo do normal");
		else
		if (imc <= 25)
			System.out.println(nome+" você está normal");
		else
		if (imc <= 30)
			System.out.println(nome+" você está acima do normal");
		else
		if (imc <= 35)
			System.out.println(nome+" você está em obesidade 1");
		else
		if (imc <= 40)
			System.out.println(nome+" você está em obesidade 2");
		else
			System.out.println(nome+" você está em Morbidade");
		pessoa.close();
	}
}