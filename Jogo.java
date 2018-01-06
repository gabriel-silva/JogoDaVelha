import java.util.Scanner;

public class Jogo {

	static final int TAM = 3;

	public static void jogador1(Registros tabuleiro) {


		Scanner leitor = new Scanner(System.in);
		
		int linha1 = 0;
		int coluna1 = 0;
		String linha = "";
		String coluna = "";

		System.out.println(" ");
		System.out.println("Vez do jogador 1");
		System.out.println("Caracter X ");

		System.out.println("Informe a linha que deseja jogar e depois pressione ENTER: ");
		linha = leitor.nextLine();
		
		while (!linha.matches("[0-2]")) {
			System.out.println("Opcao invalida! Informe a linha novamente e depois pressione ENTER: ");
			linha = leitor.nextLine();
			
		}
		
		linha1 = Integer.valueOf(linha);
		
		System.out.println("Agora informe a coluna que deseja jogar e depois pressione ENTER: ");
		coluna = leitor.nextLine();

		while (!coluna.matches("[0-2]")) {
			System.out.println("Opcao invalida! Informe a coluna novamente e depois pressione ENTER: ");
			coluna = leitor.nextLine();
			
		}
		
		coluna1 = Integer.valueOf(coluna);
		
		while (tabuleiro.tabela[linha1][coluna1] != Numera.VAZIO) {

			System.out.println("Opcao invalida! Casa ocupada, informe a linha novamente e depois pressione ENTER: ");
			linha = leitor.nextLine();
			
			while (!linha.matches("[0-2]")) {
				System.out.println("Informe a linha novamente e depois pressione ENTER: ");
				linha = leitor.nextLine();
				
			}

			linha1 = Integer.valueOf(linha);
			
			System.out.println("Opcao invalida! Casa ocupada, informe a coluna novamente e depois pressione ENTER: ");
			coluna = leitor.nextLine();

			while (!coluna.matches("[0-2]")) {
				System.out.println("Informe a coluna novamente e depois pressione ENTER: ");
				coluna = leitor.nextLine();
				
			}

			coluna1 = Integer.valueOf(coluna);
			
		}

		
		tabuleiro.tabela[linha1][coluna1] = Numera.X;
		
		
	}

	public static void jogador2(Registros tabuleiro) {


		Scanner leitor = new Scanner(System.in);
		
		int linha1 = 0;
		int coluna1 = 0;
		String linha = "";
		String coluna = "";

		System.out.println(" ");
		System.out.println("Vez do jogador 2");
		System.out.println("Caracter O ");

		System.out.println("Informe a linha que deseja jogar e depois pressione ENTER: ");
		linha = leitor.nextLine();
		
		while (!linha.matches("[0-2]")) {
			System.out.println("Opcao invalida! Informe a linha novamente e depois pressione ENTER: ");
			linha = leitor.nextLine();
			
		}
		
		linha1 = Integer.valueOf(linha);
		
		System.out.println("Agora informe a coluna que deseja jogar e depois pressione ENTER: ");
		coluna = leitor.nextLine();

		while (!coluna.matches("[0-2]")) {
			System.out.println("Opcao invalida! Informe a coluna novamente e depois pressione ENTER: ");
			coluna = leitor.nextLine();
			
		}
		
		coluna1 = Integer.valueOf(coluna);
		
		while (tabuleiro.tabela[linha1][coluna1] != Numera.VAZIO) {

			System.out.println("Opcao invalida! Casa ocupada, informe a linha novamente e depois pressione ENTER: ");
			linha = leitor.nextLine();
			
			while (!linha.matches("[0-2]")) {
				System.out.println("Informe a linha novamente e depois pressione ENTER: ");
				linha = leitor.nextLine();
				
			}

			linha1 = Integer.valueOf(linha);
			
			System.out.println("Opcao invalida! Casa ocupada, informe a coluna novamente e depois pressione ENTER: ");
			coluna = leitor.nextLine();

			while (!coluna.matches("[0-2]")) {
				System.out.println("Informe a coluna novamente e depois pressione ENTER: ");
				coluna = leitor.nextLine();
				
			}

			coluna1 = Integer.valueOf(coluna);
			
		}

		
		tabuleiro.tabela[linha1][coluna1] = Numera.O;
		
	
	}

	public static void resetJogo(Registros tabuleiro) {

		for (int i = 0; i < tabuleiro.tabela.length; i++) {
			for (int j = 0; j < tabuleiro.tabela[i].length; j++) {

				tabuleiro.tabela[i][j] = Numera.VAZIO;
			}
		}

	}

	
	public static void impressaoMatriz(Registros tabuleiro) {

		System.out.println("    0   1   2   ");

		for (int i = 0; i < tabuleiro.tabela.length; i++) {
			System.out.printf("%d", i);
			for (int j = 0; j < tabuleiro.tabela[i].length; j++) {

				if (tabuleiro.tabela[i][j] == Numera.X) {
					System.out.printf(" | X");

				} else if (tabuleiro.tabela[i][j] == Numera.O) {

					System.out.printf(" | O");
				} else {
					System.out.printf(" |  ");
				}

			}
			System.out.printf(" |\n");
		}

	}

	public static boolean vencedorX(Registros tabuleiro) {

		if (VerificaJogada.estaNaLinhaX(tabuleiro) || VerificaJogada.estaNaColunaX(tabuleiro)
				|| VerificaJogada.estaNaDiagonalX(tabuleiro)) {

			InterfaceGrafica.jogadorVencedorX();
			return true;
		}
		return false;

	}

	public static boolean vencedorO(Registros tabuleiro) {
		if (VerificaJogada.estaNaLinhaO(tabuleiro) || VerificaJogada.estaNaColunaO(tabuleiro)
				|| VerificaJogada.estaNaDiagonalO(tabuleiro)) {

			InterfaceGrafica.jogadorVencedorO();
			return true;
		}
		return false;

	}

	public static boolean estaCheio(Registros tabuleiro) {

		for (int i = 0; i < tabuleiro.tabela.length; i++) {
			for (int j = 0; j < tabuleiro.tabela[i].length; j++) {

				if (tabuleiro.tabela[i][j] == Numera.VAZIO) {
					return true;
				}

			}

		}

		return false;

	}

	public static void jogar() {

		Registros tabuleiro = new Registros();
		tabuleiro.tabela = new Numera[TAM][TAM];

		resetJogo(tabuleiro);
		InterfaceGrafica.matrizIndicacao();

		do {

			jogador1(tabuleiro);
			impressaoMatriz(tabuleiro);
			if (vencedorX(tabuleiro)) {
				break;
			}
			if (estaCheio(tabuleiro) == false) {
				InterfaceGrafica.empateEntreJogadores();
				break;
			}

			jogador2(tabuleiro);
			impressaoMatriz(tabuleiro);
			if (vencedorO(tabuleiro)) {
				break;
			}

		} while (true);

	}
}