package exercicios_p_iniciantes_estrutura_condicional;

public class construtor_p_cada_classe {
	
	private int r, g, b;
	
	public construtor_p_cada_classe(int r,int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	 
	}

public class Computador {
	 private String marca;
	 private int anoFabricacao;
	 private double velocidade;
	 private boolean novo;
	 
	 public Computador(String marca, int anoFabricacao, double velocidade, boolean novo) {
		 this.marca = marca;
		 this.anoFabricacao = anoFabricacao;
		 this.velocidade = velocidade;
		 this.novo = novo;
		 
	 }
}

public class Lampada {
	private boolean ligada;
	
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
}

public class Produto {
	private String nome, descricao;
	private double valor;
	private int quantidadeEstoque;
	
	public Produto (String nome, String descricao, double valor, int quantidadeEstoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidadeEstoque = quantidadeEstoque;
		
	}
}