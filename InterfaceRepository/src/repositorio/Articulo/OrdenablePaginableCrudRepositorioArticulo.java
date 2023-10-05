package repositorio.Articulo;

import repositorio.Cliente.ContableRepositorio;
import repositorio.Cliente.Ordenablerepositorio;
import repositorio.Cliente.PaginableRepositorio;

public interface OrdenablePaginableCrudRepositorioArticulo extends OrdenableRepositorioArticulo,
        PaginableRepositorioArticulo, CrudRepositorioArticulo, ContableRepositorio {
}
