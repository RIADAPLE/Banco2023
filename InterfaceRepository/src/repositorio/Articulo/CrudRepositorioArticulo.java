package repositorio.Articulo;

import modelo.Articulo;

import java.util.List;

public interface CrudRepositorioArticulo {
    List<Articulo> listar();
    Articulo porId(Integer id);
    void crear(Articulo cliente);
    void editar(Articulo cliente);
    void eliminar(Integer id);
}
