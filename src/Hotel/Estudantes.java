package Hotel;

public class Estudantes {
	private String nome;
	private String email;
	
	public Estudantes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public Estudantes() {
		
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	

	public class Quarto {
		Estudantes ocupa;
		
		public boolean naoOcupado() {
			return ocupa == null;
		}
		
		public void alugarQuarto(Estudantes estudantes) {
			ocupa = estudantes;
		}
	}
	

	class Hotel {
		Quarto[] quartos;
		
		public Hotel() {
			quartos = new Quarto [10];
			for (int i = 0; i < 10; i++) {
				quartos[i] = new Quarto();
				
			}
		}
		
		public void cadastrarAluguel(Estudantes estudantes, int numeroQuarto) {
			if(numeroQuarto >= 0 && numeroQuarto < 10 && quartos[numeroQuarto].naoOcupado()) {
				quartos[numeroQuarto].alugarQuarto(estudantes);
				System.out.println("Aluguel: " + (numeroQuarto + 1) + "Nome: " + estudantes.nome + "Email: " + estudantes.email + "Quarto: " + numeroQuarto);
				
			} else {
				System.out.println("Este quarto nao esta disponivel");
			}
		}
		
	
			}
		
	}

	
	
	


