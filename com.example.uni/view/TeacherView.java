package view;

import java.util.List;
import java.util.Scanner;

import controller.TeacherController;
import model.User;
import model.impl.Teacher;

public class TeacherView implements UserView{

    private TeacherController controller = new TeacherController();

    @Override
    public Teacher create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя учителя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию учителя: ");
        String lastName = scanner.nextLine();
        Teacher teacher = controller.create(name, lastName);
        System.out.println(teacher);
        return teacher;
    }

    @Override
    public User getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id учителя: ");
        int id = scanner.nextInt();
        Teacher teacher = controller.getById(id);
        System.out.println(teacher);
        return teacher;
    }

    public List<Teacher> getAllTeachers(){
        List<Teacher> teachers = controller.getAll();
        System.out.println(teachers);
        return teachers;
    }
    
}
