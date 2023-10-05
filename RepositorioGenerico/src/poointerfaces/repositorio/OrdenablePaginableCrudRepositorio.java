package poointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends Ordenablerepositorio<T>,
                    PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio{
}
