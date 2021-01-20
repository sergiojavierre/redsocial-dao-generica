package com.piramide.ui;

import com.piramide.dao.DAOFactory;
import com.piramide.entities.Usuario;

import java.util.Scanner;

public class MenuConsola implements Menu{

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        Usuario usuarioEntrar = DAOFactory.getInstance().getDaoUsuario().entrar(email,password);
        if(usuarioEntrar==null){
            System.out.println("El login es incorrecto");
        }
        else{
            System.out.println(usuarioEntrar);
        }
    }

    @Override
    public void registrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Alias: ");
        String alias = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        DAOFactory.getInstance().getDaoUsuario().registrar(alias,email,password);
    }
}
