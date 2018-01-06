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

	public static void sobreMenu() { // metodo sobre, informa��o do jogo

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
		System.out.println(" |                          Mais informa��es                         |   ");
		System.out.println(" |                        Ismaleysants@gmail.com                     |   ");
		System.out.println(" |                       yasmminmclaudino@gmail.com                  |   ");
		System.out.println(" |                   gabrieldasneves201686@gmail.com                 |   ");
		System.out.println(" =====================================================================   ");
		System.out.println("\n");

	}

	public static void ajudaMenu() { // metodo de ajuda, como jogar e tatica de jogo
		System.out.println();
		System.out.println(" =======================================================================================  ");
		System.out.println(" |  O Jogo da Velha � uma matriz de tr�s linhas por tr�s colunas.                       | ");
		System.out.println(" |  Os jogadores escolhem uma op��o, c�rculo (O) ou um xis (X).                         | ");
		System.out.println(" |  Os jogadores jogam alternadamente, uma marca��o por vez, no espa�o que esteja vazia.| ");
		System.out.println(" |  Voc� ganha quando  tr�s c�rculos ou tr�s xis esteja na mesma linha,                 | ");
		System.out.println(" |  sendo horizontal, vertical ou diagonal.                                             | ");
		System.out.println(" |                             TATICA DE JOGO                                           | ");
		System.out.println(" |  1. Se voc� tem duas pe�as numa linha, ponha a terceira para ganhar.                 | ");
		System.out.println(" |  2. Se o oponente tiver duas pe�as em linha, ponha a terceira para bloque�-lo.       | ");
		System.out.println(" |  3. Crie uma oportunidade em que voc� poder� ganhar de duas maneiras.                | ");
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