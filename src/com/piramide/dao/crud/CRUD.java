package com.piramide.dao.crud;

import java.util.List;

public interface CRUD <T>{
    public void inserta(T t);
    public List<T> busca();
    public void actualiza(T t, int id);
    public void borra(int id);
}
