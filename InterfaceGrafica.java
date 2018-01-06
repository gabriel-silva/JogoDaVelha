public class InterfaceGrafica {

	public static void menuDoJogo() { // metodo menu
		System.out.println();
		System.out.println("  || >>>> Jogo da Velha - O jogo <<<< ||");
		System.out.println("               \t MENU");
		System.out.println("        ======================");
		System.out.println("        |     1 - Jogar      |");
		System.out.println("        |     2 - Sobre      |");
		System.out.println("        |     3 - Ajuda      |");
		System.out.println("        |     4 - Sair       |");
		System.out.println("        =================v2.3\n");
		System.out.println("Digite uma opcao e depois pressione ENTER: ");
	}

	public static void sobreMenu() { // metodo sobre, informação do jogo

		System.out.println("\n");
		System.out.println(" =====================================================================   ");
		System.out.println(" |                     || >>>> Sobre <<<< ||                         |   ");
		System.out.println(" |            || >>>> Jogo da Velha - O jogo <<<< ||                 |   ");
		System.out.println(" |                     Versao 2.3 - 03/12/2016                       |   ");
		System.out.println(" | Instituto Federal de Educacao, Ciencia e Tecnologica de Pernambuco|   ");
		System.out.println(" |             Curso Tecnico de Informatica para Internet            |   ");
		System.out.println(" |             Logica de Programacao e Estrutura de Dados            |   ");
		System.out.println(" |                      Ismael Santos da Silva                       |   ");
		System.out.println(" |                        Yasmmin Monteiro                           |   ");
		System.out.println(" |               Jose Gabriel Vicente das Neves da Silva             |   ");
		System.out.println(" |                          Mais informações                         |   ");
		System.out.println(" |                        Ismaleysants@gmail.com                     |   ");
		System.out.println(" |                       yasmminmclaudino@gmail.com                  |   ");
		System.out.println(" |                   gabrieldasneves201686@gmail.com                 |   ");
		System.out.println(" =====================================================================   ");
		System.out.println("\n");

	}

	public static void ajudaMenu() { // metodo de ajuda, como jogar e tatica de jogo
		System.out.println();
		System.out.println(" =======================================================================================  ");
		System.out.println(" |  O Jogo da Velha é uma matriz de três linhas por três colunas.                       | ");
		System.out.println(" |  Os jogadores escolhem uma opção, círculo (O) ou um xis (X).                         | ");
		System.out.println(" |  Os jogadores jogam alternadamente, uma marcação por vez, no espaço que esteja vazia.| ");
		System.out.println(" |  Você ganha quando  três círculos ou três xis esteja na mesma linha,                 | ");
		System.out.println(" |  sendo horizontal, vertical ou diagonal.                                             | ");
		System.out.println(" |                             TATICA DE JOGO                                           | ");
		System.out.println(" |  1. Se você tem duas peças numa linha, ponha a terceira para ganhar.                 | ");
		System.out.println(" |  2. Se o oponente tiver duas peças em linha, ponha a terceira para bloqueá-lo.       | ");
		System.out.println(" |  3. Crie uma oportunidade em que você poderá ganhar de duas maneiras.                | ");
		System.out.println(" ======================================================================================== ");
		System.out.println();

	}

	public static void opcaoSair() {

		System.out.println();
		System.out.println("  ================================================================  ");
		System.out.println("  | Tem certeza que deseja sair do jogo? Sair(1) || Continuar(0) |   ");
		System.out.println("  ================================================================  ");
		System.out.println();
	}

	public static void opcaoInvalidaSair() {

		System.out.println();
		System.out.println(" ========================== ");
		System.out.println(" |     Opcao Invalida     | ");
		System.out.println(" | Sair(1) || Continuar(0)| ");
		System.out.println(" ========================== ");
		System.out.println();

	}
	public static void opcaoInvalida(){
		
		System.out.println();
		System.out.println("   ===============================================================  ");
		System.out.println("   |		             Opcao Invalida!                     |  ");
		System.out.println("   ===============================================================  ");
		System.out.println();
		
	}

	public static void matrizIndicacao() {

		System.out.println("   0  1  2");
		System.out.println("0 |  |  |  |");
		System.out.println("1 |  |  |  |");
		System.out.println("2 |  |  |  |");

	}


	public static void jogadorVencedorX(){
		
		System.out.println();
		System.out.println("   ===============================================================  ");
		System.out.println("   |		            Jogador 1 venceu!!!!                 |  ");
		System.out.println("   ===============================================================  ");
		System.out.println();
		
	}

	public static void jogadorVencedorO(){
		
		System.out.println();
		System.out.println("   ===============================================================  ");
		System.out.println("   |		             Jogador 2 venceu!!!!                |  ");
		System.out.println("   ===============================================================  ");
		System.out.println();
		
	}

	public static void empateEntreJogadores(){
		
		System.out.println();
		System.out.println("   ===============================================================  ");
		System.out.println("   |		                  Empate!!!                      |  ");
		System.out.println("   ===============================================================  ");
		System.out.println();
		
	}

	public static void jogoEncerrado() {

		System.out.println();
		System.out.println("   ===============================================================  ");
		System.out.println("   |		             Jogo Encerrado!                     |  ");
		System.out.println("   ===============================================================  ");
		System.out.println();

	}
}