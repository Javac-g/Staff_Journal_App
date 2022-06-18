package V3.Model;

import V3.Data.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Person> datalist = new ArrayList<>();

    public Person create(String name,String position, Integer id){
        Person person = new Person();

        person.setName(name);
        person.setPosition(position);
        person.setId(id);
        datalist.add(person);
        return person;
    }
    public Person read(Integer id){
        for (Person p : datalist){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    public Person update(Integer id,String n, String p,Integer setId){
        Person person = read(id);
        if (person != null){
            person.setName(n);
            person.setPosition(p);
            person.setId(setId);
            return person;
        }
        return null;
    }
    public Integer delete(Integer id){
        int index = -1;
        for (int i = 0; i < datalist.size(); i++){
            if (datalist.get(i).getId().equals(id)){
                index = i;
            }
        }
        if (index != -1){
            return index;
        }
        return null;
    }
}
