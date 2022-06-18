package V3.Controller;

import V3.Data.Person;
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

                case 2:
                    view.printMessage("Enter id to find person: ");
                    Person finded = model.read(view.addId());
                    if (finded != null){
                        view.printData(finded);
                    }else {
                        view.printMessage("Nobody finded");
                    }
            }

        }

    }
}
