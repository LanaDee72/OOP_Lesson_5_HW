package view;

import java.util.List;
import java.util.Scanner;

import controller.StudentController;
import model.impl.Student;

public class StudentView implements UserView {
    
    private StudentController controller = new StudentController();

    public List<Student> getAllStudents(){
        List<Student> students = controller.getAll();
        System.out.println(students);
        return students;
    }

    @Override
    public Student create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию студента: ");
        String lastName = scanner.nextLine();
        Student student = controller.create(name, lastName);
        System.out.println(student);
        return student;
    }

    @Override
    public Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }
}
