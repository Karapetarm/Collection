package school;


import java.util.*;

public class DataBase {

    private static DataBase dataBase;

    public Map<Teacher,List<Student>> teachers;
    public Map<Student,List<Teacher>> students;

    private DataBase(){}

    public static DataBase getDataBase(){
        if(dataBase==null)
            dataBase=new DataBase();
        return dataBase;
    }

    public List<Student> newStudentList(){
        return new LinkedList<>();
    }

    public List<Teacher> newTeacherList(){
        return new LinkedList<>();
    }

    public Student getStudent(int studentIdNumber){
        Set<Student> studentsList=students.keySet();
        for(Student student:studentsList)
            if(student.getIdNumber().equals(studentIdNumber))
                return student;
        System.out.println("Student Not Found");
        return null;
    }

    public Teacher getTeacher(int teacherIdNumber){
        Set<Teacher> teachersList=teachers.keySet();
        for(Teacher teacher:teachersList)
            if(teacher.getIdNumber().equals(teacherIdNumber))
                return teacher;
        System.out.println("Teacher Not Found");
        return null;
    }

    public boolean createTeacherToStudentLink(Student student, Teacher teacher){
       return students.get(student).add(teacher)& teachers.get(teacher).add(student);
    }

    public boolean discardTeacherToStudentLink(Teacher teacher,Student student){
        return teachers.get(teacher).remove(student)& students.get(student).remove(teacher);
    }

    public boolean removeTeacher(Teacher teacher){
        boolean result=true;
        List<Student> studentList=teachers.get(teacher);
        for(Student student:studentList){
            result &= discardTeacherToStudentLink(teacher,student);
        }
        result &= teachers.remove(teacher,studentList);
        return result;

    }

    public boolean removeStudent(Student student){
        boolean result=true;
        List<Teacher> teacherList=students.get(student);
        for(Teacher teacher:teacherList){
            result &= discardTeacherToStudentLink(teacher,student);
        }
        result &= students.remove(student,teacherList);
        return result;
    }


}
