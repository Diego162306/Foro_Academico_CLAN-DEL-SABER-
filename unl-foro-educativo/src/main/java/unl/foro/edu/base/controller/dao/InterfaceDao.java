package unl.foro.edu.base.controller.dao;

import unl.foro.edu.base.controller.data_struct.list.Linkendlist;

public interface InterfaceDao <T> {
    public Linkendlist<T> listAll();
    public void persist(T obj) throws Exception;
    public void update(T obj, Integer pos) throws Exception;
    public void update_by_id(T obj, Integer id) throws Exception;
    public T get(Integer id) throws Exception;
}
