package produtosDAO;
import java.util.List;

import produtos.Produto;

public interface ProdutoDAO {
    List<Produto> findAll();   
    List<Produto> findByName(String name);
    List<Produto> findById(int id);
    boolean insertProduto(Produto produto);
    boolean updateProduto(Produto produto);
    boolean deleteProduto(Produto produto);

}
