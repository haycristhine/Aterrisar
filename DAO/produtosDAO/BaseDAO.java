package produtosDAO;
import java.util.List;

public interface BaseDAO {
    List<Object> findAll();   
    List<Object> findByName(String name);
    List<Object> findById(int id);
    Object insertObject(Object produto);
    boolean updateObject(Object produto);
    boolean deleteObject(Object produto);

}
