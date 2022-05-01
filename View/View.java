package View;

import Data.Data;

import java.util.Scanner;

public class View {
    private final static Scanner scanner = new Scanner(System.in);

    public Integer readCommand(){

        return scanner.nextInt();

    }
    public void printMessage(String msg){

        System.out.println(msg);

    }

    public void printMenu(){
        System.out.println("Please choose command: ");
        System.out.println("1 - Add person");
        System.out.println("2 - Find person");
        System.out.println("3 - Update person");
        System.out.println("4 - Delete person");
        System.out.println("5 - Exit");
    }

    public void printData(Data data){

        System.out.println("Name: " + data.getName());
        System.out.println("Position: " + data.getPosition());
        System.out.println("Salary: " + data.getSalary());

    }
    // local variables inlined
    public String addName(){
        System.out.println("Enter name: ");
        return scanner.next();
    }
    public String addPosition(){
        System.out.println("Enter position: ");
        return scanner.next();

    }

    public Integer addSalary(){
        System.out.println("Enter salary: ");
        return scanner.nextInt();
    }







}
