package app;

import java.util.Scanner;

import entities.Produto;

public class TelaInicial {

	public static void main(String[] args) {

		Produto p1 = new Produto("nfndk", "nfjsgd");

		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.print(
		 * "001010001010001010001010000010100001010001010010100010101\n"); System.out.
		 * print("01010001010001010001010        00010100010100101000101010\n");
		 * System.out.print("*********************** NANPPA *************************\n"
		 * ); System.out.
		 * print("00101000101000101000101        00001010001010010100010101\n");
		 * System.out.print(
		 * "010100010100010100010100000101000010100010100101000101010\n\n"); System.out.
		 * print("---------------A loja do Dev desesperado!----------------\n");
		 */
		System.out.println("\t\t888b    888        d8888 888b    888 8888888b.  8888888b.         d8888 \r\n"
				+ "\t\t8888b   888       d88888 8888b   888 888   Y88b 888   Y88b       d88888 \r\n"
				+ "\t\t88888b  888      d88P888 88888b  888 888    888 888    888      d88P888 \r\n"
				+ "\t\t888Y88b 888     d88P 888 888Y88b 888 888   d88P 888   d88P     d88P 888 \r\n"
				+ "\t\t888 Y88b888    d88P  888 888 Y88b888 8888888P\"  8888888P\"     d88P  888 \r\n"
				+ "\t\t888  Y88888   d88P   888 888  Y88888 888        888          d88P   888 \r\n"
				+ "\t\t888   Y8888  d8888888888 888   Y8888 888        888         d8888888888 \r\n"
				+ "\t\t888    Y888 d88P     888 888    Y888 888        888        d88P     888 \r\n"
				+ "                                                                        ");
		System.out.println(
				" ___   _        _          _          _               _                                          _       _ \r\n"
						+ "| . | | | ___  <_> ___   _| | ___   _| | ___  _ _   _| | ___  ___ ___  ___ ___  ___  _ _  ___  _| | ___ | |\r\n"
						+ "|   | | |/ . \\ | |<_> | / . |/ . \\ / . |/ ._>| | | / . |/ ._><_-</ ._><_-<| . \\/ ._>| '_><_> |/ . |/ . \\|_/\r\n"
						+ "|_|_| |_|\\___/ | |<___| \\___|\\___/ \\___|\\___.|__/  \\___|\\___./__/\\___./__/|  _/\\___.|_|  <___|\\___|\\___/<_>\r\n"
						+ "              <__'                                                        |_|                              ");

		System.out.print(
				"\n============================================================================================================\n");
		System.out.print("\nDESEJA FAZER COMPRAS ? (S/N) \n");

		char op = 'n';
		boolean fazerCompra = false;

		op = scan.next().charAt(0);
		if (op == 'n' || op == 'N') {
			fazerCompra = false;
		} else if (op == 's' || op == 'S') {
			fazerCompra = true;
		}
		if (fazerCompra == false) {
			System.out.print("\n===============================================================================\n");
			System.out.print("\n\n");
			System.out.print("Ok! Espero que nos vejamos em breve! ");
			System.out.print("\n\n");
			System.out.print("\n===============================================================================\n");
		} else {
			p1.cabecalho();
			p1.mostraProduto();
			p1.selecionaProduto();

			while (fazerCompra == true) {
				p1.mostraProdutoAtualizado();

				System.out.print("\n\nCONTINUAR COMPRA? [S/N]: ");

				op = scan.next().charAt(0);
				if (op == 's' || op == 'S') {

					for (int L = 0; L < 50; L++) {

						System.out.println("\n");
					}
					p1.mostraProdutoAtualizado();
					p1.selecionaProduto();

				} else if (op == 'n' || op == 'N') {

					for (int L = 0; L < 50; L++) {

						System.out.println("\n");
					}
					p1.formaPagamento();
					p1.notaFiscal();
					break;
				}
			}
		}
	}
}
