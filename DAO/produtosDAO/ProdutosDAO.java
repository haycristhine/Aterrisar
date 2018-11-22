package produtosDAO;
import java.util.List;

import produtosDAO.BaseDAO;

public class ProdutosDAO implements BaseDAO{

	public ProdutosDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object insertObject(Object produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateObject(Object produto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteObject(Object produto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean reservarProduto(Object produto) {
		return false;
	}

}
