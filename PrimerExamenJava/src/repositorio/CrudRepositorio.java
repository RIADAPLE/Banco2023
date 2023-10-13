package repositorio;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    void crear(T t);
    T porId(Integer id);
    void editar(T t);
    void eliminar(Integer id);
}
