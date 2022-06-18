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
}
