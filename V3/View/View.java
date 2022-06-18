package V3.View;

import java.util.Scanner;

public class View {

    private final static Scanner scanner = new Scanner(System.in);

    public void printMessage(String  msg){

        System.out.println(msg);

    }

    public void printMenu(){
        System.out.println("Menu");
        System.out.println("1 - add person");
        System.out.println("2 - find person");
        System.out.println("3 - update person");
        System.out.println("4 - delete person");
        System.out.println("5 - exit");
    }
    public void printData()



}
