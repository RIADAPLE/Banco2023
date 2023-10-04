import modelo.*;

import static modelo.Genero.PROGRAMACION;
import static modelo.Imprimible.TEXTO_DEFECTO;
import static modelo.Imprimible.imprimir;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("John", "Doe"),
                "Ingeiero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador fullstack")
        .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseños: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });

        System.out.println(TEXTO_DEFECTO);
    }
}