package com.ss.ita.menu;
import com.ss.ita.kata.Six;
import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementationsOfKata {
    private static Scanner scanner = new Scanner(System.in);
    private Eight eightKatas;
    private Seven sevenKatas;
    private Six sixKatas;
    private Five fiveKatas;
    private StringBuilder basic =new StringBuilder("com.ss.ita.kata.implementation");




 public void chooseKatasByName(String name){
        switch (name){
            case "AndriiTurianskyi":
                this.eightKatas = new com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl();
                this.sevenKatas = new com.ss.ita.kata.implementation.AndriiTurianskyi.SevenImpl();
                this.sixKatas = new com.ss.ita.kata.implementation.AndriiTurianskyi.SixImpl();
                this.fiveKatas = new com.ss.ita.kata.implementation.AndriiTurianskyi.FiveImpl();
                break;
            case "HannaVasiunyk":
                this.eightKatas = new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl();
                this.sevenKatas = new com.ss.ita.kata.implementation.HannaVasiunyk.SevenImpl();
                this.sixKatas = new com.ss.ita.kata.implementation.HannaVasiunyk.SixImpl();
                this.fiveKatas = new com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl();
                break;
            case "Khrystyna":
                this.eightKatas = new com.ss.ita.kata.implementation.Khrystyna.ImplEight();
                this.sevenKatas = new com.ss.ita.kata.implementation.Khrystyna.ImplSeven();
                this.sixKatas = new com.ss.ita.kata.implementation.Khrystyna.ImplSix();
                this.fiveKatas = new com.ss.ita.kata.implementation.Khrystyna.ImplFive();
                break;
            case "Maria":
                this.eightKatas = new com.ss.ita.kata.implementation.Maria.EightImpl();
                this.sevenKatas = new com.ss.ita.kata.implementation.Maria.SevenImpl();
                this.sixKatas = new com.ss.ita.kata.implementation.Maria.SixImpl();
                this.fiveKatas = new com.ss.ita.kata.implementation.Maria.FiveImpl();
                break;
            case "mike":
                this.eightKatas = new com.ss.ita.kata.implementation.mike.EightImpl();
                this.sevenKatas = new com.ss.ita.kata.implementation.mike.SevenImpl();
                this.sixKatas = new com.ss.ita.kata.implementation.mike.SixImpl();
                this.fiveKatas = new com.ss.ita.kata.implementation.mike.FiveImpl();
                break;
            case "Nastia3":
                this.eightKatas = new com.ss.ita.kata.implementation.Nastia3.EightImpl();
                this.sevenKatas = new com.ss.ita.kata.implementation.Nastia3.SevenImpl();
                this.sixKatas = new com.ss.ita.kata.implementation.Nastia3.SixImpl();
                this.fiveKatas = new com.ss.ita.kata.implementation.Nastia3.FiveImpl();
                break;
            case "vadkostuk":
                this.eightKatas = new com.ss.ita.kata.implementation.vadkostuk.EightImpl();
                this.sevenKatas = new com.ss.ita.kata.implementation.vadkostuk.SevenImpl();
                this.sixKatas = new com.ss.ita.kata.implementation.vadkostuk.SixImpl();
                this.fiveKatas = new com.ss.ita.kata.implementation.vadkostuk.FiveImpl();
                break;
            default:
                System.out.println("null");
        }
    }
    public String getTask (int taskId) {
        switch (taskId) {
            case 1:
                return taskKeepHydrated();

            case 2:
                return taskVolumeOfCuboid();

            default:
                return "Error";
        }

    }

    public String taskKeepHydrated(){
        System.out.println("Enter int value");
        double litres = scanner.nextInt();
        return String.valueOf(eightKatas.liters(litres));
    }
    public String taskVolumeOfCuboid(){
        System.out.println("Enter 3 double value");
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        return String.valueOf(eightKatas.getVolumeOfCuboid(length,width,height));
    }

}
  /*Варіант на даний момент не працює
    public Path getPaths(String nameOfPackage, String nameOfClass) {
        StringBuilder fullPath = basic.append(nameOfPackage).append(nameOfClass);
        return Paths.get(fullPath.toString());
    }

    public void initializationOfMethod(Path fullPaths, String nameOfClass){
        switch (nameOfClass){
            case "EightImpl()":
                this.eightKatas = (Eight)fullPaths;
                break;
            case "SevenImpl()":
                this.sevenKatas = (Seven)fullPaths;
                break;
            case "SixImpl()":
               this.sixKatas =  (Six)fullPaths;
               break;
            case "FiveImpl()":
                this.fiveKatas = (Five)fullPaths;
                break;
            default:
                System.out.println("Error");
        }
    }


    }
*/