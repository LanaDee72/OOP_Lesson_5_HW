package model.db;

import java.util.ArrayList;
import java.util.List;

import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;

public class DataBase {

    public static final List<Student> studentDB = new ArrayList<>();
    public static final List<Teacher> techerDB = new ArrayList<>();
    public static final List<StudyGroup> studyGroupDB = new ArrayList<>();

    public static void fillDB(){

        Teacher teacher = new Teacher(1, "Вася", "Иванов");
        techerDB.add(teacher);

        Student s1 = new Student(1, "Рик", "Старк");
        Student s2 = new Student(2, "Джофри", "Ланистер");
        studentDB.add(s1);
        studentDB.add(s2);
    }
    
}
