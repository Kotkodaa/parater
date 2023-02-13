/*
* File: MainConsole.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1 N
* Date: 2023-02-06
* Github: https://github.com/sulanadam/
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        about();
        task();
        doit();
    }
    public void task(){
        System.out.println("Feladat 0251 megoldása: ");
        System.out.println("A paralelogramma területe: ");
    }
    public void about(){
        System.out.println("Sulan Ádám");
        System.out.println("SZOFT-I-1-N");
        System.out.println("2023-02-06");
    }
    private String input(String msg){
        System.out.println(msg);
        Scanner scanner=new Scanner(System.in);
        String value=scanner.nextLine();
        return value;
    }        
    private void doit(){
        String aStr=input("A oldal: ");
        String bStr=input("B oldal: ");
        String gammaStr=input("Gamma szög: ");
        double a=Double.parseDouble(aStr);
        double b=Double.parseDouble(bStr);
        double gamma=Double.parseDouble(gammaStr);

        Paralelogramma paralelogramma=new Paralelogramma();
        double eredmeny=paralelogramma.terulet(a,b,gamma);
        System.out.printf("%.2f\n",eredmeny);
    }
}