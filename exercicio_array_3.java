package exercícios_array;

import java.util.Scanner;

public class exercicio_array_3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

        double[] salarios = new double[10];

        double maior = 0.0;

        int indice = 0;

        for(int i=0;i<10;++i){

                System.out.print("Digite um salário: ");

                salarios[i] = leitor.nextDouble();

        }

        for(int i=0;i<10;++i){

                if(salarios[i] > maior){

                        maior = salarios[i];

                        indice = i;

                }

        }

        System.out.println("O índice do maior salário é: "+ indice);
	}

}
