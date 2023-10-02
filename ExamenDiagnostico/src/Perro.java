public class Perro extends Canino{
    private Integer fuerzaMordida;
    public Perro() {
    }

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro es omnívoro";
    }

    @Override
    public String dormir() {
        return "El perro duerme de 12 a 14 horas";
    }

    @Override
    public String correr() {
        return "La velocidad de los perros varía dependiendo de la raza...";
    }

    @Override
    public String comunicarse() {
        return "Los perros se comunican a través de ladridos, aullidos y derivados";
    }

    @Override
    public String toString() {
        return "------- Perro -------\n" +

                "Color: \t\t\t" + color + '\n' +
                "Habitat \t\t" + habitat + '\n' +
                "Altura: \t\t" + altura + '\n'+
                "Largo: \t\t\t" + largo + '\n'+
                "Peso: \t\t\t" + peso + '\n' +
                "Fuerza de Mordida: " + fuerzaMordida + '\n'+
                "Nombre Científico: " + nombreCientifico + '\n' +
                "Tamaño de Colmillos: " + tamanoColmillos + '\n'+
                '\n';
    }
}
