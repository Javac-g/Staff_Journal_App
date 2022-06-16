package V2.View;

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
        return id;
    }
    public Integer addSalary(){
        System.out.println("Enter salary: ");
        Integer salary = scanner.nextInt();
        return salary;
    }


}
