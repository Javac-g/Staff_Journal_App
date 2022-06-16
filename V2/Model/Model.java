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

}
