package com.ss.ita.menu;

import com.ss.ita.kata.Five;

import com.ss.ita.kata.implementation.Khrystyna.ImplFive;
import com.ss.ita.kata.implementation.Krynytsky.FiveImpl;
import com.ss.ita.util.Scanner;



public class KataFive implements Kata {

    private int taskNumber;
    private Five five;




    @Override
    public void getTasks(final Scanner scanner) {
        System.out.println("\nChoose task:");
        System.out.println("1.Artificial Rain");
        System.out.println("2.Gap in Primes");
        System.out.println("3.Trailing zeros in factorial");
        System.out.println("4.Perimeter of squares in a rectangle");
        System.out.println("5.Which x for that sum?");
        System.out.println("6.Find the smallest");
        System.out.println("Enter your choose: ");
        this.taskNumber = scanner.readInt();


    }

    @Override
    public void runTask(int userNumber){
        switch(userNumber){
            case 1: {
                this.five = new com.ss.ita.kata.implementation.AndriiTurianskyi.FiveImpl();
                break;
            }

            case 2: {
                this.five = new com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl();
                break;
            }
            case 3: {
                this.five = new ImplFive();
                break;
            }
            case 4: {
                this.five = new FiveImpl();
                break;
            }
            case 5: {
                this.five = new com.ss.ita.kata.implementation.Maria.FiveImpl();
                break;
            }
            case 6: {
                this.five = new com.ss.ita.kata.implementation.mike.FiveImpl();
                break;
            }
            case 7: {
                this.five = new com.ss.ita.kata.implementation.Nastia3.FiveImpl();
                break;
            }
            case 8: {
                this.five = new com.ss.ita.kata.implementation.vadkostuk.FiveImpl();
                break;
            }
        }
        switch(this.taskNumber){
            case 1: {
                 int result = this.five.artificialRain(new int[]{1,2,1,2,1});
                System.out.println(result);
                break;
            }
        }

    }

}
