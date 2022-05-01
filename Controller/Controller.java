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
                model.create(view.addName(),view.addPosition(),view.addSalary());
                view.printMessage("Saved");

            }
            else if(command == 2){

                view.printMessage("Enter person to Find: ");
                Data data = model.read(view.addName());

                if(data != null){

                    view.printData(data);

                }else {

                    view.printMessage("Nothing to show");

                }


            }else if(command == 3){

                view.printMessage("Enter person to update: ");
                Data newData = model.Update(view.addName(), view.addName(), view.addPosition(), view.addSalary());
                view.printMessage("Result:  ");

                if(newData != null){

                    view.printData(newData);

                }else {

                    view.printMessage("Nothing to update");

                }



            } else if (command == 4) {

                view.printMessage("Enter person to delete: ");

                int index = model.delete(view.addName());

                if(index != -1){

                    view.printMessage("Deleted " + index + " element");

                }else {

                    view.printMessage("Nothing to delete: ");

                }


            }else {

                view.printMessage("Wrong command ");

            }


        }














    }
}
