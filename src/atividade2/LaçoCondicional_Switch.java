package atividade2;
import java.util.Scanner;

public class LaçoCondicional_Switch
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int codigoProd, quantidade;
		float valorUnd, valorTotal;

		System.out.println("Digite o Código do Produto (1 a 6): ");
		codigoProd = leia.nextInt();

		System.out.println("Digite a Quantidade: ");
		quantidade = leia.nextInt();

		switch (codigoProd) 
		{
			case 1:
				valorUnd = 10;
				valorTotal = quantidade * valorUnd;
				System.out.println("Produto: Cachorro Quente");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
	
			case 2:
				valorUnd = 15;
				valorTotal = quantidade * valorUnd;
				System.out.println("Produto: X-Salada");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
	
			case 3:
				valorUnd = 18;
				valorTotal = quantidade * valorUnd;
				System.out.println("Produto: X-Bacon");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
	
			case 4:
				valorUnd = 12;
				valorTotal = quantidade * valorUnd;
				System.out.println("Produto: Bauru");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
	
			case 5:
				valorUnd = 8;
				valorTotal = quantidade * valorUnd;
				System.out.println("Produto: Refrigerante");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
	
			case 6:
				valorUnd = 13;
				valorTotal = quantidade * valorUnd;
				System.out.println("Produto: Suco de laranja");
				System.out.printf("Valor total: R$ %.2f", valorTotal);
				break;
				
			default:
				System.out.println("Opção inválida!");
		}
		leia.close();
	}
}
