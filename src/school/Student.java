package school;


import java.util.ArrayList;
import java.util.List;

import static school.DataBase.getDataBase;

public class Student {

    private String firstName;
    private String lastName;
    private int idNumber;

   public Student(String firstName, int idNumber, String lastName) {
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.lastName = lastName;
       getDataBase().students.put(this,getDataBase().newTeacherList());
    }
    public Student(String firstName, int idNumber, String lastName,List<Teacher> teacherList) {
        this(firstName,idNumber,lastName);
        getDataBase().students.replace(this,teacherList);
    }
//
//    public Student createStudent(String firstName, int idNumber, String lastName){
//        return new Student(firstName,idNumber,lastName);
//    }
//
//    public Student createStudent(String firstName, int idNumber, String lastName,List<Teacher> teacherList){
//        return new Student(firstName,idNumber,lastName,teacherList);
//    }
//
    public String getFirstName() {
        return firstName;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Teacher> getTeacherList() {
        return getDataBase().students.get(this);
    }
}
