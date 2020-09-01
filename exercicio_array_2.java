package exercícios_array;

import java.util.Scanner;

public class exercicio_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i=0;i<10;++i){

            System.out.print("Digite um número: ");

            numeros[i] = leitor.nextInt();
		}
		
		System.out.print("A média é: " + (numeros [0] + numeros [1] + numeros [2] + numeros [3] + numeros [4] + numeros [5] + numeros [6] + numeros [7] + numeros [8] + numeros [9])/10);
		
	}

}
