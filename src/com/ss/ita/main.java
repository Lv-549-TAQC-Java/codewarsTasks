package com.ss.ita;

import com.ss.ita.menu.ImplementationsOfKata;
import com.ss.ita.menu.Menu;
import com.ss.ita.util.implementation.ConsoleScanner;

public class main {
    public static void main(String[] args) {
//        System.out.println("Hello!");
//        int a;
//        ConsoleScanner consoleScaner = new ConsoleScanner();
//        a = consoleScaner.readInt();
//        System.out.println(a);
        Menu menu = new Menu();

        menu.initKatas();
        menu.printList(menu.getKata8());

        ImplementationsOfKata impl = new ImplementationsOfKata();

      impl.chooseKatasByName("vadkostuk");
        System.out.println(impl.getTask(1));

    }
}
