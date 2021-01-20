package com.piramide.entities;

public class Usuario {

    private String alias, email, password;

    public Usuario(String alias, String email, String password) {
        this.alias = alias;
        this.email = email;
        this.password = password;
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
