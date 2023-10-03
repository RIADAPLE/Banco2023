public class Motor {
    private double clindrada;
    private TipoMotor tipo;

    public Motor(){

    }
    public Motor(double clindrada, TipoMotor tipo) {
        this.clindrada = clindrada;
        this.tipo = tipo;
    }

    public double getClindrada() {
        return clindrada;
    }

    public void setClindrada(double clindrada) {
        this.clindrada = clindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
