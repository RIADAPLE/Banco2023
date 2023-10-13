package repositorio;

import modelo.Pelicula;
import modelo.UsuarioRegistrado;
import modelo.UsuarioRegistrado;

import java.util.List;

public class UsuarioRegistradoRepositorio extends AbstractList<UsuarioRegistrado> {
    @Override
    public List<UsuarioRegistrado> listar() {
        return this.dataSource;
    }

    @Override
    public void crear(UsuarioRegistrado usuarioRegistrado) {
        this.dataSource.add(usuarioRegistrado);
    }

    public UsuarioRegistrado porId(Integer id) {
        UsuarioRegistrado resultado = null;
        for(UsuarioRegistrado ur: dataSource){
            if(ur.getId() != null && ur.getId().equals(id)){
                resultado = ur;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(UsuarioRegistrado usuarioRegistrado) {
        UsuarioRegistrado c = this.porId(usuarioRegistrado.getId());
        c.setNombre(usuarioRegistrado.getNombre());
        c.setDireccion(usuarioRegistrado.getDireccion());
        c.setNumeroTelefono(usuarioRegistrado.getNumeroTelefono());
    }

    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    public void iniciarSesión(){
        System.out.println("Se inició sesión");
    }

    public void cierreSesión(){
        System.out.println("Se cerró sesión");
    }

    public void verPelículas(Pelicula pelicula){
        System.out.println("Se verá: " + pelicula);
    }

    public void reservarBillete(){
        System.out.println("Se reservó un billete");
    }
    public void realizarPago(){
        System.out.println("Se realizó el pago, Gracias!");
    }

    public void cancelarBillete(){
        System.out.println("Se canceló el billete :c");
    }
}
