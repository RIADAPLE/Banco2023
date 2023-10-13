package repositorio;

import modelo.Pelicula;

import java.util.List;

public class PeliculaRepositorio extends AbstractList<Pelicula> {
    @Override
    public List<Pelicula> listar() {
        return this.dataSource;
    }

    @Override
    public void crear(Pelicula pelicula) {
        this.dataSource.add(pelicula);
    }

    public Pelicula porId(Integer id) {
        Pelicula resultado = null;
        for(Pelicula cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Pelicula pelicula) {
        Pelicula c = this.porId(pelicula.getId());
        c.setNombreDePelícula(pelicula.getNombreDePelicula());
        c.setLugar(pelicula.getLugar());
        c.setPeliculaEspectáculo(pelicula.getPeliculaEspectáculo());
    }

    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    public void detallesActualizacion(){
        System.out.println("Se actualizaron los detalles!");
    }
}
