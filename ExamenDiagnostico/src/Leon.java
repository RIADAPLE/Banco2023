public class Leon extends Felino{

    private Integer numManada;
    private float potenciaRugidoDecibel;

    public Leon() {
    }

    @Override
    public String comer() {
        return "El leon macho deja que la leona cace su comida y se dispone a comer";
    }

    @Override
    public String dormir() {
        return "El leon macho pasa la mayor parte del tiempo dormido, 20 horas, el más holgazán...";
    }

    @Override
    public String correr() {
        return "El leon puede correr a una velocidad de hasta 74 Km/h";
    }

    @Override
    public String comunicarse() {
        return "El leon se comunica a través de rugidos al igual que sus contrapartes felinas";
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad, Integer numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String toString() {
        return "------- Leon ------- \n" +
                "Num. Manada: \t" + numManada + '\n' +
                "Tamaño Garras: \t" + tamanoGarras + '\n' +
                "Velocidad: \t\t" + velocidad + '\n' +
                "Habitat: \t\t" + habitat + '\n' +
                "Altura: \t\t" + altura + '\n' +
                "Largo: \t\t\t" + largo + '\n' +
                "Peso: \t\t\t" + peso + '\n' +
                "Nombre Científico: " + nombreCientifico + '\n' +
                "Potencia Rugido Decibel: " + potenciaRugidoDecibel + '\n' +
                '\n';
    }
}
