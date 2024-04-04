
public class sobrecarga_de_metodos {
	
	private String marca, descricao;
	private int anoFabricacao, velocidade;
	private boolean novo;
	
	public sobrecarga_de_metodos(String marca, String descricao, int anoFabricacao, int velocidade, boolean novo) {
		this.marca = marca;
		this.descricao = descricao;
		this.anoFabricacao = anoFabricacao;
		this.velocidade = velocidade;
		this.novo = novo;
	}
	
	
	public sobrecarga_de_metodos(String marca, String descricao) {
		this.marca = marca;
		this.descricao = descricao;
}
}