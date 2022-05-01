package Controller;

import Data.Data;
import Model.Model;
import View.View;

public class Controller {

    Model model = new Model();
    View view = new View();



    public void initController(){
        while (true){

            view.printMenu();
            Integer command = view.readCommand();

            if(command == 5) {
                System.out.println("Good bye");
                break;
            }
            else if(command == 1){

                view.printMessage("Add new person");
                model.c

            }











        }














    }
}
