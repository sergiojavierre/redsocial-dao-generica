package com.piramide.dao.usuarios;

import com.piramide.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class DAOUsuarioDemo implements DAOUsuario{

    List<Usuario> usuariosRegistrados = null;

    public DAOUsuarioDemo() {
        this.usuariosRegistrados = new ArrayList<>();
    }

    @Override
    public Usuario entrar(String email, String password) {
        for(int i = 0; i < usuariosRegistrados.size(); i++){
            Usuario usuario = usuariosRegistrados.get(i);
            if(usuario.getEmail().equals(email) && usuario.getPassword().equals(password)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void registrar(String alias, String email, String password) {
        usuariosRegistrados.add(new Usuario(alias,email,password));
    }
}
