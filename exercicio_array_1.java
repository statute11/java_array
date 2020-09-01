package exercícios_array;
import java.util.Scanner;

public class exercicio_array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		String[] nomes = new String [10];
		
		for(int i=0;i<10;++i){

            System.out.print("Digite um nome: ");

            nomes[i] = leitor.next();
		}
		
		System.out.println("------ NOMES INFORMADOS ------");
		
		for(int i=0;i<10;++i){
			
			System.out.println(nomes[i]);
			
		
		}
		
		
	
		
		}	
	}


