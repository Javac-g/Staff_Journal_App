package Model;

import Data.Data;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Data> datalist = new ArrayList<>();

    void create(String name,String position, Integer salary){

        Data data = new Data();
        data.setName(name);
        data.setPosition(position);
        data.setSalary(salary);
        datalist.add(data);

    }

    Data read(String name){

        for(Data search : datalist){
            if(search.getName().equals(name)){
                return search;
            }
        }

        return null;


    }

    Data Update(String oldName,String newName,String newPosition, Integer newSalary){
        Data result = read(oldName);

        if(result != null){

            result.setName(newName);
            result.setPosition(newPosition);
            result.setSalary(newSalary);
            return result;

        }
        return null;

    }


}
