package model;

import java.util.List;

import model.impl.Student;
import model.impl.Teacher;

public class StudyGroup {
    private int id;
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(int id, Teacher teacher, List<Student> students){
        this.id = id;
        this.teacher = teacher;
        this.students = students;
    }

    public int getId(){
        return id;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public List<Student> getListStudents(){
        return students;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + ": id = %s, %s, %s", id, teacher, students);
    }
}
