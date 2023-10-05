public abstract class Electronico implements IElectronico, IProducto {

    private String fabricante;
    @Override
    public String getFabricante() {
        return fabricante;
    }
}
