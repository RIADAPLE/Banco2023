public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;
    public Lobo() {
    }

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "La táctica de caza consiste en agotar a la presa, persiguiéndola hasta que su captura y consumo se hace posible";
    }

    @Override
    public String dormir() {
        return "El lobo duerme en promedio de 7 a 8 horas";
    }

    @Override
    public String correr() {
        return "El lobo puede correr con una velocidad de hasta 60 Km/H";
    }

    @Override
    public String comunicarse() {
        return "Lobos Grises se comunican entre ellos con aullidos, lenguaje del cuerpo, y aroma";
    }

    @Override
    public String toString() {
        return "------- Lobo -------\n" +
                "Color: \t\t\t" + color + '\n'+
                "Habitat: \t\t" + habitat + '\n' +
                "Altura: \t\t" + altura + '\n' +
                "Largo: \t\t\t" + largo + '\n'+
                "Peso: \t\t\t" + peso + '\n'+
                "Num. Camada: \t" + numCamada + '\n'+
                "Especie Lobo: \t" + especieLobo + '\n' +
                "Tamaño de Colmillos: " + tamanoColmillos + '\n'+
                "Nombre Científico: " + nombreCientifico + '\n' +
                '\n';
    }
}
