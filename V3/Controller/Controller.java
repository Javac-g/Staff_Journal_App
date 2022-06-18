package V3.Controller;

import V3.Model.Model;
import V3.View.View;

public class Controller {

    Model model = new Model();
    View view = new View();
    Integer command = 0;



    public void initController(){

        while (command != 5){

            view.printMenu();
            command = view.readCommand();

            switch (command){
                case 1:
                    view.printMessage("Enter person data:");
                    model.create(view.addName(), view.addPosition(), view.addId());
                    view.printMessage("done");


            }

        }

    }
}
