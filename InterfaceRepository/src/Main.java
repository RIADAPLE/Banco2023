import modelo.Articulo;
import modelo.Cliente;
import repositorio.Articulo.ArticuloListRepositorio;
import repositorio.Articulo.OrdenablePaginableCrudRepositorioArticulo;
import repositorio.Articulo.OrdenableRepositorioArticulo;
import repositorio.Cliente.ClienteListRepositorio;
import repositorio.Cliente.Direccion;
import repositorio.Cliente.OrdenablePaginableCrudRepositorio;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        OrdenablePaginableCrudRepositorioArticulo repoArt = new ArticuloListRepositorio();

        //repoArt(new Articulo("jugo",20.50f,"Juguito de caja"));

        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés", "Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Cliente> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        for (Cliente c : clientesOrdenAsc) {
            System.out.println(c);
        }


        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println(" ============== ");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total =====");
        System.out.println("Total registros: " + repo.total());
    }
}