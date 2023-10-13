package repositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractList<T> implements CrudRepositorio<T> {
    protected List<T> dataSource;
    public AbstractList(){
        this.dataSource = new ArrayList<>();
    }

    public List<T> listar(){
        return dataSource;
    }

    @Override
    public void crear(T t){
        this.dataSource.add(t);
    }
}
