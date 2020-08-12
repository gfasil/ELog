package com.faya.co.elog.service;

import java.util.List;

public interface CrudService<T> {

    public List<T> getAll();
    public T add(T t);
    public T update(Long id,T t);
    public void delete();

}
