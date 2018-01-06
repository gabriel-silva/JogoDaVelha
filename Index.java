import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean opcaoSair = true;

		do {

			String opcao = "";

			InterfaceGrafica.menuDoJogo();
			opcao = entrada.nextLine();

			while (!opcao.matches("[0-9]{1,}")) {

				InterfaceGrafica.opcaoInvalida();
				opcao = entrada.nextLine();
			}

			switch (Integer.valueOf(opcao)) {

			case 1:

				Jogo.jogar();
				
				break;

			case 2:

				InterfaceGrafica.sobreMenu();
				
				break;

			case 3:

				InterfaceGrafica.ajudaMenu();
				
				break;

			case 4:

				InterfaceGrafica.opcaoSair();
				String sair = entrada.nextLine();

				while (!sair.matches("[0-1]")) {

					InterfaceGrafica.opcaoInvalidaSair();
					sair = entrada.nextLine();

				}

				if (sair.matches("1")) {

					InterfaceGrafica.jogoEncerrado();
					opcaoSair = false;

				} else {

					opcaoSair = true;
				}

				break;

			default:

				InterfaceGrafica.opcaoInvalida();
				
				break;

			}

		} while (opcaoSair);
	}

}
