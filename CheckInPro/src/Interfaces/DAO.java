// DAO.java
package Interfaces;

import java.util.List;

public interface DAO<T> {
    public void crear(T entidad) throws Exception;
    public void modificar(T entidad) throws Exception;
    public void borrar(int id) throws Exception;
    public List<T> listar() throws Exception;
}
