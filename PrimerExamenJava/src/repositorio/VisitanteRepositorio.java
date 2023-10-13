package repositorio;

import modelo.Visitante;
import modelo.Visitante;

import java.util.List;

public class VisitanteRepositorio extends AbstractList<Visitante>{
    @Override
    public List<Visitante> listar() {
        return this.dataSource;
    }

    @Override
    public void crear(Visitante visitante) {
        this.dataSource.add(visitante);
    }

    public Visitante porId(Integer id) {
        Visitante resultado = null;
        for(Visitante cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Visitante visitante) {
        Visitante c = this.porId(visitante.getId());
        c.setNombre(visitante.getNombre());
    }

    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }
}
