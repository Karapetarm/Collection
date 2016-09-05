package school;

import java.util.ArrayList;
import java.util.List;
import static school.DataBase.getDataBase;

public class Teacher {
    private String firstName;
    private String lastName;
    private int idNumber;


    private Teacher(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        getDataBase().teachers.put(this,getDataBase().newStudentList());
    }

    private Teacher(String firstName, String lastName, int idNumber, List<Student> studentList) {
        this(firstName,lastName,idNumber);
        getDataBase().teachers.replace(this,studentList);
    }

    public Teacher createTeacher(String firstName, String lastName, int idNumber){
        return new Teacher(firstName,lastName,idNumber);
    }

    public Teacher createTeacher(String firstName, String lastName, int idNumber,List<Student> students){
        return new Teacher(firstName,lastName,idNumber,students);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public List<Student> getStudentList() {
        return getDataBase().teachers.get(this);
    }
}
