package atividade1;
import java.util.Scanner;

public class DiferençaDoProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, diferença;
		
		System.out.println("numero1: ");
		n1 = leia.nextFloat();
		
		System.out.println("numero2: ");
		n2 = leia.nextFloat();

		System.out.println("numero3: ");
		n3 = leia.nextFloat();
		
		System.out.println("numero4: ");
		n4 = leia.nextFloat();
		
		diferença = (n1 * n2) - (n3 * n4);
		System.out.printf("Diferença: %.1f", diferença);
				
		leia.close();

	}

}
