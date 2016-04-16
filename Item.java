package br.unipe.mplIII.pwc.modelo;

public class Item implements Comparable<Item>{
	
	protected int codigo;
	protected String descricao;
	protected double preco;
	
	public Item(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int compareTo(Item item) {
		if(this.codigo > item.codigo){
			return -1;
		}
		
		if(this.codigo < item.codigo){
			return 1; 
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	

}
