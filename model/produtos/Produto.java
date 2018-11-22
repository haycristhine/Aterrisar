package produtos;

import produtosDAO.ProdutosDAO;

public class Produto{
	private int id;
	private float valor;
	private float desconto;
	private String name;
	private ProdutosDAO dao;

	public Produto(String name, float valor, float desconto) {
		this.name = name;
		this.valor = valor;
		this.desconto = desconto;
		this.getDAO().insertObject((Object)this);
	}
	
	private ProdutosDAO getDAO() {
		if (this.dao == null) {
			this.dao = new ProdutosDAO();
		}
		return this.dao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	public float getValorFinal() {
		return this.valor - this.desconto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
