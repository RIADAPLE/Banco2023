import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args){
        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6,TipoMotor.GASOLINA), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Pérez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto: autos) {
            System.out.println(auto);
            imprimirDetalle(auto);
        }
    }

    public static void imprimirDetalle(Automovil auto){
        System.out.println(
                "Fabricante: " + auto.getFabricante() + '\n'+
                "Modelo: " + auto.getModelo());

                if(auto.getColor()!= null){
                    System.out.println("Color: " + auto.getColor());
                }
                if(auto.getColorPatente()!= null){
                    System.out.println("Patente de color: " + auto.getColorPatente());
                }
                if(auto.getMotor() !=null){
                    System.out.println("Motor del carro: " +auto.getMotor().getTipo() + " con " +auto.getMotor().getClindrada() + " Cilindros");
                }
        System.out.println(
                "Estanque: " + auto.getEstanque().getCapacidad()
        );
                if(auto.getConductor()!= null){
                    System.out.println("Conductor: " + auto.getConductor().toString());
                }
        System.out.println("\n-----------------------------------\n");
    }
}
