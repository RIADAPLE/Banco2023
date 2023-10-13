package repositorio;

import modelo.Admin;
import modelo.Pelicula;

import java.util.List;

public class AdminRepositorio extends AbstractList<Admin> {
    @Override
    public List<Admin> listar() {
        return this.dataSource;
    }

    @Override
    public void crear(Admin admin) {
        this.dataSource.add(admin);
    }

    public Admin porId(Integer id) {
        Admin resultado = null;
        for(Admin cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Admin admin) {
        Admin c = this.porId(admin.getId());
        c.setNombre(admin.getNombre());
        c.setContrasena(admin.getContrasena());
    }

    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    public PeliculaRepositorio anadirPeli(Admin admin, PeliculaRepositorio peliculaRepositorio, Pelicula pelicula){
        for (Admin administrador :
                this.dataSource) {
            if(administrador.getId()== admin.getId()){
                peliculaRepositorio.crear(pelicula);
            }
        }
        return peliculaRepositorio;
    }

    public PeliculaRepositorio actualizarPeli(Admin admin, PeliculaRepositorio peliculaRepositorio, Pelicula pelicula){
        for (Admin administrador :
                this.dataSource) {
            if(administrador.getId()== admin.getId()){
                peliculaRepositorio.editar(pelicula);
            }
        }
        return peliculaRepositorio;
    }

    public PeliculaRepositorio eliminarPeli(Admin admin, PeliculaRepositorio peliculaRepositorio, Pelicula pelicula){
        for (Admin administrador :
                this.dataSource) {
            if(administrador.getId()== admin.getId()){
                peliculaRepositorio.eliminar(pelicula.getId());
            }
        }
        return peliculaRepositorio;
    }
}
