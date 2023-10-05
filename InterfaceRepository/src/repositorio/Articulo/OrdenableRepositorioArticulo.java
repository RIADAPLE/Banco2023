package repositorio.Articulo;

import modelo.Articulo;
import modelo.Cliente;
import repositorio.Direccion;

import java.util.List;

public interface OrdenableRepositorioArticulo {
    List<Articulo> listar(String campo, Direccion dir);
}
