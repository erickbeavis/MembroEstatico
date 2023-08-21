package cotacao;

import java.util.Scanner;

import util.Conversor;

public class Cotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Conversor conversor = new Conversor();
		
		System.out.print("Qual o valor do dólar?: ");
		conversor.real = sc.nextDouble();
		
		System.out.println("Quantos dólares deseja comprar? ");
		conversor.dolar = sc.nextDouble();
		double total = conversor.quantosReais();
		double iof = total * 0.06;
		double converteu = total + iof;
		
		System.out.println("Valor total a ser pago pelos dólares em Reais: R$ " + converteu);
		
		sc.close();
	}

}