public class Tigre extends Felino{
    private String especieTigre;

    public Tigre() {
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre cazó exitósamente a su presa y se dispone a comer";
    }

    @Override
    public String dormir() {
        return "El tigre duerme 16 horas diarias... ¡Qué holgazán!";
    }

    @Override
    public String correr() {
        return "El tigre corre a una velocidad de hasta 65 km/h, pero en períodos muy cortos";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge para comunicarse...";
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String toString() {
        return "------- Tigre -------\n" +
                "Especie Tigre: \t" + especieTigre + '\n' +
                "tamaño garras: \t" + tamanoGarras + '\n' +
                "Velocidad: \t\t" + velocidad + '\n' +
                "Habitat: \t\t" + habitat + '\n' +
                "Altura: \t\t" + altura + '\n' +
                "Largo: \t\t\t" + largo + '\n' +
                "Peso: \t\t\t" + peso + '\n' +
                "Nombre Científico: " + nombreCientifico + '\n' +
                '\n';
    }
}
