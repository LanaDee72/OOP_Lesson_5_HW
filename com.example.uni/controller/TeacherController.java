package controller;

import java.util.List;

import model.impl.Teacher;
import service.TeacherService;

public class TeacherController implements UserController{

    private TeacherService service = new TeacherService();

    @Override
    public Teacher create(String name, String lastName) {
        return service.create(name, lastName);
    }

    @Override
    public Teacher getById(int id) {
        Teacher teacher = null;
        try{
            teacher = service.getById(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return teacher;
    }

        public List<Teacher> getAll() {
        return service.getAll();
    }
    
}
