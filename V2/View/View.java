package V2.View;

import V2.Data.Student;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    public Integer readCommand(){
        System.out.println("Enter command: ");
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

    public Integer addId(){
        System.out.println("Enter id: ");
        Integer id = scanner.nextInt();
        return 123+ id;
    }
    public Integer addSalary(){
        System.out.println("Enter salary: ");
        Integer salary = scanner.nextInt();
        return salary;
    }

    public void printMesage(String msg){
        System.out.println(msg);

    }
    public void printData(Student student){
        System.out.println("Name: " + student.getName());
        System.out.println("Position: " + student.getPosition());
        System.out.println("ID: " + student.getId());
        System.out.println("Salary: " + student.getSalary());
    }
    public void printMenu(){
        System.out.println("Menu:");
        System.out.println("1 - add student");
        System.out.println("2 - find student");
        System.out.println("3 - update student");
        System.out.println("4 - delete student");
        System.out.println("5 - exit");
    }



}
