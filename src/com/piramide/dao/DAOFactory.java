package com.piramide.dao;

import com.piramide.dao.usuarios.DAOUsuario;
import com.piramide.dao.usuarios.DAOUsuarioDemo;

public class DAOFactory {

    private static DAOFactory daoFactory;
    private DAOUsuario daoUsuario;

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOUsuario getDaoUsuario() {
        if(daoUsuario == null){
            daoUsuario = new DAOUsuarioDemo();
        }
        return daoUsuario;
    }
}
