package V2.Controller;

import V2.Data.Student;
import V2.Model.Model;
import V2.View.View;

public class Controller {

    Model  model = new Model();
    View view = new View();

    public void initController(){
        while (true){
            view.printMenu();
            Integer command = view.readCommand();

            switch (command){
                case 1:
                    view.printMesage("Enter person data: ");
                    model.create(view.addName(), view.addPosition(), view.addId(), view.addSalary());
                    view.printMesage("Person data saved");
                case 2:
                    view.printMesage("Enter id person to find:");
                    Student student = model.read(view.addId());
                    if (student != null){
                        view.printData(student);

                    }else {
                        view.printMesage("Nothing to show");
                    }
                case 3:
                    view.printMesage("Enter person to update");
                    Student up = model.update(view.addId(), view.addName(), view.addPosition(), view.addId(), view.addSalary());
                    if (up != null){
                        view.printData(up);
                    }else {
                        view.printMesage("Nothing to update");
                    }
                case 4:
                    view.printMesage("Enter id to delete:");
                    Integer index = model.delete(view.addId());

                    if (index != -1){
                        view.printMesage("Was deleted person № " + index);

                    }else {
                        view.printMesage("Nobody find to delete.");
                    }
                case 5:
                    break;


                default:
                    view.printMesage("Wrong comm  and");
            }
        }

    }
}
