package repositorio.Articulo;

import modelo.Articulo;
import modelo.Cliente;
import repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ArticuloListRepositorio implements OrdenablePaginableCrudRepositorioArticulo {
    private List<Articulo> dataSource;

    public ArticuloListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

    @Override
    public List<Articulo> listar() {
        return dataSource;
    }

    @Override
    public Articulo porId(Integer id) {
        Articulo articulo = new Articulo();
        for(Articulo art: dataSource){
            if(art.getId() != null && art.getId().equals(id)){
                articulo = art;
                break;
            }
        }
        return articulo;
    }

    @Override
    public void crear(Articulo articulo) {
        this.dataSource.add(articulo);
    }

    @Override
    public void editar(Articulo articulo) {
        Articulo a = this.porId(articulo.getId());
        a.setNombre(articulo.getNombre());
        a.setDescripcion(articulo.getDescripcion());
        a.setPrecio(articulo.getPrecio());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Articulo> listar(String campo, Direccion dir) {
        List<Articulo> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    public static int ordenar(String campo, Articulo a, Articulo b){
        int resultado = 0;
        switch(campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "descripcion" ->
                    resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" ->
                resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }

    @Override
    public List<Articulo> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }
}
