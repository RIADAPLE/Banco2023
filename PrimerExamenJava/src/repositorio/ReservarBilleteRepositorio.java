package repositorio;

import modelo.ReservarBillete;

import java.util.List;

public class ReservarBilleteRepositorio extends AbstractList<ReservarBillete>{
    @Override
    public List<ReservarBillete> listar() {
        return this.dataSource;
    }

    @Override
    public void crear(ReservarBillete reservarBillete) {
        this.dataSource.add(reservarBillete);
    }

    public ReservarBillete porId(Integer id) {
        ReservarBillete resultado = null;
        for(ReservarBillete cli: dataSource){
            if(cli != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(ReservarBillete reservarBillete) {
        ReservarBillete c = this.porId(reservarBillete.getId());
        c.setFecha(reservarBillete.getFecha());
        c.setHora(reservarBillete.getHora());
        c.setPelicula(reservarBillete.getPelicula());
        c.setMostrarNumero(reservarBillete.getMostrarNumero());
        c.setNumeroEntradasDisponibles(reservarBillete.getNumeroEntradasDisponibles());
    }

    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    public void actualizarAsientos(){
        System.out.println("Se actualizaron los asientos");
    }
    
}
