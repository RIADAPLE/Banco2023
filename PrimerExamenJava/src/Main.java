import modelo.*;
import repositorio.*;

import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Listamos todos los repositorios para poder utilizar sus métodos específicos,
        //En vez de Crud repository, así podemos utilizar por ejemplo "Añadir Película"
        //un método específico de admin repositorio, o realizar pago para usuario

        AdminRepositorio admin = new AdminRepositorio();
        PeliculaRepositorio pelicula = new PeliculaRepositorio();
        RealizarPagoRepositorio realizarPago = new RealizarPagoRepositorio();
        ReservarBilleteRepositorio reservarBille = new ReservarBilleteRepositorio();
        UsuarioRegistradoRepositorio usuarioRegistrado = new UsuarioRegistradoRepositorio();
        VisitanteRepositorio visitante = new VisitanteRepositorio();
        Date fechaEspecifica = new Date(121, 8, 22);


        //Creamos dos elementos para cada uno
        admin.crear(new Admin("Ricardo", "hola"));
        admin.crear(new Admin("Luis", "adios"));
        pelicula.crear(new Pelicula("Saw X",fechaEspecifica, "Cinemark"));
        pelicula.crear(new Pelicula("Paw patrol",fechaEspecifica, "Reforma"));
        usuarioRegistrado.crear(new UsuarioRegistrado("Humberto", 22123402, "Su casa"));
        usuarioRegistrado.crear(new UsuarioRegistrado("Rodrigo", 22132042, "Su casa también"));

        //Realizar pago necesita de un usuario registrado, por lo que tomamos de los
        //que ya creamos en usuarioRegistrado
        realizarPago.crear(new RealizarPago(22d,1, usuarioRegistrado.porId(1)));
        realizarPago.crear(new RealizarPago(23d,2, usuarioRegistrado.porId(2)));

        //ReservarBillete necesita película, entonces le damos de las que ya creamos
        reservarBille.crear(new ReservarBillete(8,pelicula.porId(1),3,fechaEspecifica,"10:30 PM", "J-14"));
        reservarBille.crear(new ReservarBillete(80,pelicula.porId(2),1,fechaEspecifica,"8:30 AM", "J-15"));
        visitante.crear(new Visitante("Adrián"));
        visitante.crear(new Visitante("Aparicio"));

        System.out.println("===== Administradores =====");
        System.out.println();
        admin.listar().forEach(System.out::println);
        System.out.println();
        System.out.println("===== Película =====");
        System.out.println();
        pelicula.listar().forEach(System.out::println);
        System.out.println();
        System.out.println("===== Realizar Pago =====");
        System.out.println();
        realizarPago.listar().forEach(System.out::println);
        System.out.println();
        System.out.println("===== Reservar Billete =====");
        System.out.println();
        reservarBille.listar().forEach(System.out::println);
        System.out.println();
        System.out.println("===== Usuario Registrado =====");
        System.out.println();
        usuarioRegistrado.listar().forEach(System.out::println);
        System.out.println();
        System.out.println("===== Visitante =====");
        System.out.println();
        visitante.listar().forEach(System.out::println);


        //Ahora se Probará la función de añadir película embedida en el repositorio de
        //admin, para esto se crea una película, se le envía un admin válido y el objeto
        //"PelículaRepositorio" para poder acceder y modificar la lista de películas

        Pelicula joker = new Pelicula("Joker", fechaEspecifica, "Cinepolis");
        Admin adminAgarrado = admin.porId(1);

        pelicula = admin.anadirPeli(adminAgarrado, pelicula, joker);

        System.out.println();
        System.out.println("===== Probando la función añadir película de admin =====");
        pelicula.listar().forEach(System.out::println);





    }
}