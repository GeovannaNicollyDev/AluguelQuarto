package Hotel;

import java.util.Scanner;


public class TestaHotel {

		
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Quantos quartos vão ser alugados? ");
	        int n = scanner.nextInt();

	        Estudantes.Hotel hotel = new Estudantes().new Hotel();

	        for (int i = 0; i < n; i++) {
	            System.out.println("Informe os dados do estudante: " + (i + 1));
	            System.out.print("Nome: ");
	            String nome = scanner.next();
	            System.out.print("Email: ");
	            String email = scanner.next();

	            Estudantes estudantes = new Estudantes(nome, email);

	            System.out.print("Escolha o número do quarto (de 0 a 9): ");
	            int numeroQuarto = scanner.nextInt();

	            hotel.cadastrarAluguel(estudantes, numeroQuarto);
	            
	        }

	        scanner.close();
	    }
	}