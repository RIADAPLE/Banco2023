package repositorio;

import modelo.RealizarPago;
import modelo.RealizarPago;

import java.util.List;

public class RealizarPagoRepositorio extends AbstractList<RealizarPago> {
    @Override
    public List<RealizarPago> listar() {
        return this.dataSource;
    }

    @Override
    public void crear(RealizarPago realizarPago) {
        this.dataSource.add(realizarPago);
    }

    public RealizarPago porId(Integer id) {
        RealizarPago resultado = null;
        for(RealizarPago cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(RealizarPago realizarPago) {
        RealizarPago c = this.porId(realizarPago.getId());
        c.setImporte(realizarPago.getImporte());
        c.setUsuario(realizarPago.getUsuario());
    }

    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    public void confirmarTransaccion(){
        System.out.println("Se confirmó la transacción!");
    }

    public void devolucionDinero(){
        System.out.println("Se le devolverá su dinero... algún día");
    }
}
