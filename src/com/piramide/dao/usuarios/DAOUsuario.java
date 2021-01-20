package com.piramide.dao.usuarios;

import com.piramide.entities.Usuario;

public interface DAOUsuario {

    public Usuario entrar(String email, String password);
    public void registrar(String alias, String email, String password);

}
