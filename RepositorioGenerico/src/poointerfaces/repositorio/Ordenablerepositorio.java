package poointerfaces.repositorio;

import java.util.List;

public interface Ordenablerepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}