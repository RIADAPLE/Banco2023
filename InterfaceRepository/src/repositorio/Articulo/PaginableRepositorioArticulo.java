package repositorio.Articulo;

import modelo.Articulo;
import modelo.Cliente;

import java.util.List;

public interface PaginableRepositorioArticulo {
    List<Articulo> listar(int desde, int hasta);

}
