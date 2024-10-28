package atividade1;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		float adNoturno = leia.nextFloat();

		System.out.println("Digite as Horas Extras: ");
		float horaExtra = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adNoturno + (horaExtra * 5) - descontos;
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);
				
		leia.close();
	}

}
