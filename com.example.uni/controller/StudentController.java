package controller;

import java.util.List;

import model.impl.Student;
import service.StudentService;

public class StudentController implements UserController{

    private StudentService service = new StudentService();

    @Override
    public Student create(String name, String lastName) {
        return service.create(name, lastName);
    }


    public List<Student> getAll() {
        return service.getAll();
    }

    @Override
    public Student getById(int id) {
        Student student = null;
        try{
            student = service.getById(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return student;
    }
}
