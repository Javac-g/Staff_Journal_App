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
                    break;

                case 2:
                    view.printMessage("Enter id to find person: ");
                    Person finded = model.read(view.addId());
                    if (finded != null){
                        view.printData(finded);
                        break;
                    }else {
                        view.printMessage("Nobody finded");
                        break;
                    }
                case 3:
                    view.printMessage("Update person:");
                    Person updated = model.update(view.addId(), view.addName(), view.addPosition(), view.addId());
                    if (updated != null){
                        view.printData(updated);
                        break;
                    }else {
                        view.printMessage("Nothing up to date");
                        break;
                    }
                case 5:
                    break;
            }

        }

    }
}
