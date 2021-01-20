package com.piramide;

import com.piramide.ui.Menu;
import com.piramide.ui.MenuConsola;

public class Main {

    public static void main(String[] args) {

        Menu menu = new MenuConsola();

        menu.registrar();
        menu.entrar();

    }
}
