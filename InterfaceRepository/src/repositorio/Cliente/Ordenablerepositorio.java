package repositorio.Cliente;

import modelo.Cliente;

import java.util.List;

public interface Ordenablerepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
