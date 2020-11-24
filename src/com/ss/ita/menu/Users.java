package com.ss.ita.menu;

import com.ss.ita.util.Scanner;

public class Users {
    private int userNumber;
    public void chooseUser(final Scanner scanner){
        System.out.println("\nChoose user:");
        System.out.println("1.AndriiTurianskyi");
        System.out.println("2.HannaVasiunyk");
        System.out.println("3.Khrystyna");
        System.out.println("4.Krynytsky");
        System.out.println("5.Maria");
        System.out.println("6.Mike");
        System.out.println("7.Nastia3");
        System.out.println("6.VadKostuk");
        System.out.println("Enter your choose: ");
        this.userNumber = scanner.readInt();

    }

    public int getUserNumber() {
        return userNumber;
    }
}
