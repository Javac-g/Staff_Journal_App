package V2.Model;

import V2.Data.Student;

import java.util.ArrayList;
import java.util.List;

public class Model {


    List<Student> datalist = new ArrayList<>();

    public Student create(String name,String position,Integer id,Integer salary){
        Student student = new Student();
        student.setName(name);
        student.setPosition(position);
        student.setId(id);
        student.setSalary(salary);
        datalist.add(student);
        return student;
    }
    public Student read(Integer id){
        for (Student x : datalist){
            if (x.getId().equals(id)){
                return x;
            }
        }
        return null;
    }
    public Student update(Integer idForSearch,String newName, String newPosition, Integer newId,Integer newSalary){
        Student student = read(idForSearch);
        if (student != null){
            student.setName(newName);
            student.setPosition(newPosition);
            student.setSalary(newSalary);
            student.setId(newId);
            return student;
        }
        return null;
    }

    public Integer delete(Integer id){
        int inToRem = -1;

        for (int i = 0; i < datalist.size() ; i ++){
            if (datalist.get(i).getId().equals(id)){
                inToRem = i;
            }
        }
        if (inToRem != -1){

            datalist.remove(inToRem);
            return inToRem;
        }
        return null;
    }

}
