import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tigre tigre = new Tigre("Africa",120, 220, 200, "tigris togres", 10, 40, "Bengala");
        Leon leon = new Leon("Africa", 140, 300, 200, "Leonis felinus", 120, 80, 4, 200);
        Guepardo guepardo = new Guepardo("Africa", 100, 200, 120, "Guepardex", 20, 120);
        Lobo lobo = new Lobo("America", 150, 200, 150, "canis algo", "gris", 100, 3,"Lobo gris");
        Perro perro = new Perro("El mundo", 100, 150, 50, "canis casus", "gris", 10, 200);

        List<Mamifero> mamiferos = new ArrayList<>();

        mamiferos.add(tigre);
        mamiferos.add(leon);
        mamiferos.add(guepardo);
        mamiferos.add(lobo);
        mamiferos.add(perro);

        for (Mamifero mamifero: mamiferos) {
            if( mamifero instanceof Tigre){
                System.out.println("¡Tenemos un tigre!");
                System.out.println(mamifero);
            }
            if( mamifero instanceof Leon){
                System.out.println("¡Tenemos un leon!");
                System.out.println(mamifero);
            }
            if( mamifero instanceof Guepardo){
                System.out.println("¡Tenemos un guepardo!");
                System.out.println(mamifero);
            }
            if( mamifero instanceof Lobo){
                System.out.println("¡Tenemos un lobo!");
                System.out.println(mamifero);
            }

            if( mamifero instanceof Perro){
                System.out.println("¡Tenemos un perro!");
                System.out.println(mamifero);
            }
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());

        }
    }
}