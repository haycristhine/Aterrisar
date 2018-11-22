package produtos;
import java.util.List;

import produtosDAO.ProdutoDAO;

public class Produto implements ProdutoDAO{
	private int id;
	private float valor;
	private float desconto;
	private String name;

	public Produto() {
		// TODO Auto-generated constructor stub
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

	@Override
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto insertProduto(Produto produto) {
		// TODO Auto-generated method stub
		//insere no banco e retorna objeto
		return new Produto();
	}

	@Override
	public boolean updateProduto(Produto produto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduto(Produto produto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reservarProduto(Produto produto) {
		// TODO Auto-generated method stub
		return false;
	}

}
