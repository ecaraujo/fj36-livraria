package br.com.caelum.estoque;
import java.io.Serializable;

public class ItemEstoque implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nome;
	private Integer quantidade;
	
	public ItemEstoque() {		
	}
	
	public ItemEstoque(String codigo, String nome, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
