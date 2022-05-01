package View;

import Data.Data;

import java.util.Scanner;

public class View {
    private final static Scanner scanner = new Scanner(System.in);

    Integer readCommand(){

        return scanner.nextInt();

    }
    void printMessage(String msg){

        System.out.println(msg);

    }

    void printMenu(){
        System.out.println("Please choose command: ");
        System.out.println("1 - Add person");
        System.out.println("2 - Find person");
        System.out.println("3 - Update person");
        System.out.println("4 - Delete person");
        System.out.println("5 - Exit");
    }

    void printData(Data data){

        System.out.println("Name: " + data.getName());
        System.out.println("Position: " + data.getPosition());
        System.out.println("Salary: " + data.getSalary());

    }
    // local variables inlined
    String addName(){
        System.out.println("Enter name: ");
        return scanner.next();
    }
    String addPosition(){
        System.out.println("Enter position: ");
        return scanner.next();

    }

    Integer addSalary(){
        System.out.println("Enter salary: ");
        return scanner.nextInt();
    }







}
