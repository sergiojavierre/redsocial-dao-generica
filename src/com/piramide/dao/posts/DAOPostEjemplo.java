package com.piramide.dao.posts;

import com.piramide.dao.crud.CRUD;
import com.piramide.entities.Post;

import java.util.List;

public class DAOPostEjemplo implements CRUD<Post> {

    @Override
    public void inserta(Post post) {

    }

    @Override
    public List<Post> busca() {
        return null;
    }

    @Override
    public void actualiza(Post post, int id) {

    }

    @Override
    public void borra(int id) {

    }
}
