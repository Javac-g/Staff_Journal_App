package Model;

import Data.Data;

import java.util.ArrayList;
import java.util.List;

public class Model {

    public List<Data> datalist = new ArrayList<>();

    public void create(String name,String position, Integer salary){

        Data data = new Data();
        data.setName(name);
        data.setPosition(position);
        data.setSalary(salary);
        datalist.add(data);

    }

    public Data read(String name){

        for(Data search : datalist){
            if(search.getName().equals(name)){
                return search;
            }
        }

        return null;


    }

    public Data Update(String oldName,String newName,String newPosition, Integer newSalary){
        Data result = read(oldName);

        if(result != null){

            result.setName(newName);
            result.setPosition(newPosition);
            result.setSalary(newSalary);
            return result;

        }
        return null;

    }

    public Integer delete (String name){

        int indexToRemove = -1;

        for (int i = 0; i <datalist.size();i++){

            if(datalist.get(i).equals(name)){

                indexToRemove = i;

            }

        }
        if(indexToRemove != -1){

            datalist.remove(indexToRemove);

        }
        return indexToRemove;

    }


}
