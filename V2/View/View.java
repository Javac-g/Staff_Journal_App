package V2.View;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    public Integer readCommand(){
        System.out.println("Enter command: ");
        Integer command = scanner.nextInt();
        return command;
    }

}