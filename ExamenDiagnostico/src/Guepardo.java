public class Guepardo extends Felino{
    public Guepardo() {
    }

    @Override
    public String comer() {
        return "El guepardo caza presas de tamaño mediano y se alimenta de ellas";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme 12 horas al día";
    }

    @Override
    public String correr() {
        return "El guepardo puede correr a una velocidad de hasta 130 Km/H";
    }

    @Override
    public String comunicarse() {
        return null;
    }

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String toString() {
        return "------- Guepardo -------\n"  +
                "Tamaño Garras: \t" + tamanoGarras + '\n' +
                "Velocidad: \t\t" + velocidad + '\n'+
                "Habitat: \t\t" + habitat + '\n' +
                "Altura: \t\t" + altura + '\n'+
                "Largo: \t\t\t" + largo + '\n'+
                "Peso: \t\t\t" + peso + '\n'+
                "NombreCientifico: " + nombreCientifico + '\n' +
                '\n';
    }
}
