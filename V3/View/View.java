package V3.View;

import V3.Data.Person;

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
    public void printData(Person person){
        System.out.println("Name: " + person.getName());
        System.out.println("Position: " + person.getPosition());
        System.out.println("Id: " + person.getId());
    }
    public Integer readCommand(){
        System.out.println("Your choose: ");
        Integer command = scanner.nextInt();
        return command;
    }
    public String addName(){
        System.out.println("Enter name: ");
        String name = scanner.next();
        return name;
    }
    public String addPosition(){
        System.out.println("Enter position: ");
        String position = scanner.next();
        return position;
    }



}
