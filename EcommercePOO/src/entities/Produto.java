package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Produto {

	static final int VALORFIXO = 11;
	protected String nomeLoja = "NANPPA ";
	protected String slogan = "A Loja do dev desesperado!\n";
	protected String produto[] = new String[VALORFIXO];
	protected String codigo[] = new String[VALORFIXO];
	protected int estoque[] = new int[VALORFIXO];
	protected double valor[] = new double[VALORFIXO];
	protected String tituloMatriz[] = { "COD \t |", "PRODUTO \t\t |", "VALOR \t |", "ESTOQUE", "QUANTIDADE" };

	protected int quantidadeCarrinho[] = new int[VALORFIXO];
	protected double valorCompra[] = new double[VALORFIXO];
	protected double valorTotalDaCompra = 0.00;
	protected double precoPagar = 0.00;

	public Produto(String nomeLoja, String slogan) {
		super();
		this.nomeLoja = nomeLoja;
		this.slogan = slogan;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String[] getProduto() {
		return produto;
	}

	public void setProduto(String[] produto) {
		this.produto = produto;
	}

	public String[] getCodigo() {
		return codigo;
	}

	public void setCodigo(String[] codigo) {
		this.codigo = codigo;
	}

	public int[] getEstoque() {
		return estoque;
	}

	public void setEstoque(int[] estoque) {
		this.estoque = estoque;
	}

	public double[] getValor() {
		return valor;
	}

	public void setValor(double[] valor) {
		this.valor = valor;
	}

	public String[] getTituloMatriz() {
		return tituloMatriz;
	}

	public void setTituloMatriz(String[] tituloMatriz) {
		this.tituloMatriz = tituloMatriz;
	}

	public int[] getQuantidadeCarrinho() {
		return quantidadeCarrinho;
	}

	public void setQuantidadeCarrinho(int[] quantidadeCarrinho) {
		this.quantidadeCarrinho = quantidadeCarrinho;
	}

	public double[] getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double[] valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorTotalDaCompra() {
		return valorTotalDaCompra;
	}

	public void setValorTotalDaCompra(double valorTotalDaCompra) {
		this.valorTotalDaCompra = valorTotalDaCompra;
	}

	public double getPrecoPagar() {
		return precoPagar;
	}

	public void setPrecoPagar(double precoPagar) {
		this.precoPagar = precoPagar;
	}

	public static int getValorfixo() {
		return VALORFIXO;
	}

	public void cabecalho() {
		String nomeLoja = "NANPPA", slogan = "A Loja do Dev desesperado!\n";

		System.out.print("\n");
		System.out.print("\n===============================================================================\n");
		System.out.print(nomeLoja);
		System.out.print("\n");
		System.out.print(slogan);
		System.out.print("===============================================================================\n");
		System.out.print("\n");

	}

	public void mostraProduto() {
		String tituloMatriz[] = { "COD \t |", "PRODUTO \t\t |", "VALOR \t |", "ESTOQUE" };
		produto[0] = "PRODUTO";
		produto[1] = "LIVRO JAVA I.";
		produto[2] = "LIVRO JAVA II";
		produto[3] = "LIVRO HTML 5 I";
		produto[4] = "LIVRO HTML II";
		produto[5] = "LIVRO PYTHON I";
		produto[6] = "LIVRO PYTHON II";
		produto[7] = "LIVRO EXCEL I";
		produto[8] = "LIVRO CSS 3 I";
		produto[9] = "LIVRO CSS 3 II";
		produto[10] = "LIVRO LÓGICA I";

		tituloMatriz[0] = "COD \t |";
		tituloMatriz[1] = "PRODUTO \t\t |";
		tituloMatriz[2] = "VALOR \t |";
		tituloMatriz[3] = "ESTOQUE";

		System.out.print(tituloMatriz[0]);
		System.out.print(tituloMatriz[1]);
		System.out.print(tituloMatriz[2]);
		System.out.print(tituloMatriz[3]);
		System.out.print("\n");

		for (int l = 1; l <= 10; l++) {
			codigo[l] = "G6-" + l;
			valor[l] = 100.00;
			estoque[l] = 10;
			System.out.print(codigo[l] + "\t | ");
			System.out.print(produto[l] + "\t | ");
			System.out.print(valor[l] + "\t | ");
			System.out.print(estoque[l]);
			System.out.print("\n");
		}
	}

	public void selecionaProduto() {
		try {
			Scanner scan = new Scanner(System.in);

			System.out.print("\nDigite o código do produto desejado: G6-");
			int codigoDoProdutoDesejado = scan.nextInt();
			// InputMismatchException
			while (codigoDoProdutoDesejado < 0 || codigoDoProdutoDesejado > 10) {

				System.out.print("\n-------------------------------------------------------------------------------\n");
				System.out.print("Código Inválido!! ");
				System.out.print("\n-------------------------------------------------------------------------------\n");
				System.out.print("\nDigite o código do produto desejado: G6-");
				codigoDoProdutoDesejado = scan.nextInt();

			}

			System.out.print("Digite a quantidade necessária: ");
			int quantidadeDesejada = scan.nextInt();

			while (quantidadeDesejada < 0 || quantidadeDesejada > 10) {

				System.out.print("\n-------------------------------------------------------------------------------\n");
				System.out.print("Estoque inválido!! ");
				System.out.print("\n-------------------------------------------------------------------------------\n");
				System.out.print("\nDigite a quantidade necessária:");
				quantidadeDesejada = scan.nextInt();

			}

			for (int L = 0; L < 50; L++) {

				System.out.println("\n");
			}
			for (int i = 0; i < VALORFIXO; i++) {
				if (codigoDoProdutoDesejado == i) {
					estoque[i] = estoque[i] - quantidadeDesejada;
					quantidadeCarrinho[i] = quantidadeDesejada;
					valorCompra[i] = valor[i] * quantidadeDesejada;
					valorTotalDaCompra += valorCompra[i];
				}
			}

		} catch (InputMismatchException exception) {
			System.out.print("\n===============================================================================\n");
			System.out.print("Digite apenas um código presente na lista de produtos, por favor <3");
			System.out.print("\n===============================================================================\n");
			System.out.println("\n\n");
		}
	}

	public void mostraProdutoAtualizado() {
		cabecalho();
		String tituloMatriz[] = { "COD \t |", "PRODUTO \t\t |", "VALOR \t |", "ESTOQUE" };
		System.out.print(tituloMatriz[0]);
		System.out.print(tituloMatriz[1]);
		System.out.print(tituloMatriz[2]);
		System.out.print(tituloMatriz[3]);
		System.out.print("\n");

		for (int l = 1; l <= 10; l++) {
			codigo[l] = "G6-" + l;
			System.out.print(codigo[l] + "\t | ");
			System.out.print(produto[l] + "\t | ");
			System.out.print(valor[l] + "\t | ");
			System.out.print(estoque[l]);
			System.out.print("\n");
		}

		System.out.print("\n===============================================================================\n");
		System.out.print("CARRINHO DE COMPRAS");
		System.out.print("\n===============================================================================\n");
		carrinho();

	}

	public void carrinho() {

		// System.out.println("\nCarrinho de Compras: \n");
		// System.out.println("\n");
		System.out.print(tituloMatriz[0]);
		System.out.print(tituloMatriz[1]);
		System.out.print(tituloMatriz[2]);
		tituloMatriz[3] = "QTDE";
		System.out.print(tituloMatriz[3]);
		System.out.print("\n");

		for (int l = 1; l < VALORFIXO; l++) {
			if (estoque[l] != 10) {
				System.out.print(codigo[l] + "\t | ");
				System.out.print(produto[l] + "\t | ");
				System.out.print(valorCompra[l] + "\t | ");
				System.out.print(quantidadeCarrinho[l]);
				System.out.print("\n");
			}
		}
	}

	public void formaPagamento() {
		// InputMismatchException
		int quantidadeProduto = 0;
		double desconto = 0.00;
		char formaDePagamento;
		// try {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("\n===============================================================================\n");
			System.out.print("FORMAS DE PAGAMENTO");
			System.out.print("\n===============================================================================\n");
			System.out.print(
					"\n1 - A VISTA COM 10% DESCONTO\n2 - NO CARTÃO COM ACRESCIMO DE 10%\n3 - EM DUAS VEZES COM 15% TOTAL DE ACRESCIMENTO");

			System.out.println("\n\nEscolha sua forma de pagamento:");
			formaDePagamento = scan.next().charAt(0);

			if (formaDePagamento == '1') {
				desconto = (valorTotalDaCompra * 10) / 100;
				precoPagar = (valorTotalDaCompra - desconto);
				for (int L = 0; L < 50; L++) {

					System.out.println("\n");
				}
				System.out.print("Você vai pagar: " + precoPagar);
				break;
			} else if (formaDePagamento == '2') {
				desconto = (valorTotalDaCompra * 10) / 100;
				precoPagar = (valorTotalDaCompra + desconto);
				for (int L = 0; L < 50; L++) {

					System.out.println("\n");
				}
				System.out.print("Você vai pagar: " + precoPagar);
				break;
			} else if (formaDePagamento == '3') {
				desconto = (valorTotalDaCompra * 15) / 100;
				precoPagar = (valorTotalDaCompra + desconto);
				double parcela = (precoPagar / 2);
				for (int L = 0; L < 50; L++) {

					System.out.println("\n");
				}
				System.out.print("Você vai pagar: " + precoPagar + "\nSendo em duas parcelas iguais de: " + parcela);
				break;
			}

		} while (formaDePagamento != '1' || formaDePagamento != '2' || formaDePagamento != '3');
	}

	public void notaFiscal() {
		cabecalho();

		System.out.print("===============================================================================\n");
		System.out.print("NOTA FISCAL");
		System.out.print("\n===============================================================================\n");
		carrinho();
		System.out.print("\n===============================================================================\n");
		System.out.print("\nValor da compra: " + precoPagar + "\n\n");
	}
}
