package Interface;

import java.util.List;


public interface BusinessOperations<T> {
    void update(T obj);
    List<T> sort(List<T> list);
     public T findById(List<T> list, int id);
    public T findByName(List<T> list, String name);
}
