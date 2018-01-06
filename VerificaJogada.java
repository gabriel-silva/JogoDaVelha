public class VerificaJogada {

	public static boolean estaNaLinhaX(Registros tabuleiro) {

		if (tabuleiro.tabela[0][0] == Numera.X && tabuleiro.tabela[0][1] == Numera.X && tabuleiro.tabela[0][2] == Numera.X) {

			return true;

		} else if (tabuleiro.tabela[1][0] == Numera.X && tabuleiro.tabela[1][1] == Numera.X && tabuleiro.tabela[1][2] == Numera.X) {

			return true;

		} else if (tabuleiro.tabela[2][0] == Numera.X && tabuleiro.tabela[2][1] == Numera.X && tabuleiro.tabela[2][2] == Numera.X) {

			return true;

		} else {

			return false;
		}

	}

	public static boolean estaNaColunaX(Registros tabuleiro) {

		if (tabuleiro.tabela[0][0] == Numera.X && tabuleiro.tabela[1][0] == Numera.X && tabuleiro.tabela[2][0] == Numera.X) {

			return true;

		} else if (tabuleiro.tabela[0][1] == Numera.X && tabuleiro.tabela[1][1] == Numera.X && tabuleiro.tabela[2][1] == Numera.X) {

			return true;

		} else if (tabuleiro.tabela[0][2] == Numera.X && tabuleiro.tabela[1][2] == Numera.X && tabuleiro.tabela[2][2] == Numera.X) {

			return true;

		} else {

			return false;
		}

	}

	public static boolean estaNaDiagonalX(Registros tabuleiro) {

		if (tabuleiro.tabela[0][0] == Numera.X && tabuleiro.tabela[1][1] == Numera.X && tabuleiro.tabela[2][2] == Numera.X) {

			return true;

		} else if (tabuleiro.tabela[0][2] == Numera.X && tabuleiro.tabela[1][1] == Numera.X && tabuleiro.tabela[2][0] == Numera.X) {

			return true;

		} else {

			return false;
		}

	}

	public static boolean estaNaLinhaO(Registros tabuleiro) {

		if (tabuleiro.tabela[0][0] == Numera.O && tabuleiro.tabela[0][1] == Numera.O && tabuleiro.tabela[0][2] == Numera.O) {

			return true;

		} else if (tabuleiro.tabela[1][0] == Numera.O && tabuleiro.tabela[1][1] == Numera.O && tabuleiro.tabela[1][2] == Numera.O) {

			return true;

		} else if (tabuleiro.tabela[2][0] == Numera.O && tabuleiro.tabela[2][1] == Numera.O && tabuleiro.tabela[2][2] == Numera.O) {

			return true;

		} else {

			return false;
		}

	}

	public static boolean estaNaColunaO(Registros tabuleiro) {

		if (tabuleiro.tabela[0][0] == Numera.O && tabuleiro.tabela[1][0] == Numera.O && tabuleiro.tabela[2][0] == Numera.O) {

			return true;

		} else if (tabuleiro.tabela[0][1] == Numera.O && tabuleiro.tabela[1][1] == Numera.O && tabuleiro.tabela[2][1] == Numera.O) {

			return true;

		} else if (tabuleiro.tabela[0][2] == Numera.O && tabuleiro.tabela[1][2] == Numera.O && tabuleiro.tabela[2][2] == Numera.O) {

			return true;

		} else {

			return false;
		}

	}

	public static boolean estaNaDiagonalO(Registros tabuleiro) {
		
		if (tabuleiro.tabela[0][0] == Numera.O && tabuleiro.tabela[1][1] == Numera.O && tabuleiro.tabela[2][2] == Numera.O) {

			return true;

		} else if (tabuleiro.tabela[0][2] == Numera.O && tabuleiro.tabela[1][1] == Numera.O && tabuleiro.tabela[2][0] == Numera.O) {

			return true;

		} else {

			return false;
		}

	}
}
