package start;

import java.util.Scanner;

import model.db.DataBase;
import view.StudentView;
import view.StudyGroupView;
import view.TeacherView;

public class StartProgram {
    
    private StudentView studentView = new StudentView();
    private TeacherView teacherView = new TeacherView();
    private StudyGroupView studyGroupView = new StudyGroupView();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - создать учителя");
            System.out.println("5 - найти учителя по id");
            System.out.println("6 - распечатать информацию о всех учителях");
            System.out.println("7 - создать группу");
            System.out.println("8 - найти группу по id");
            System.out.println("9 - распечатать информацию о всех группах");
            System.out.println("10 - выход");
            
            switch (scanner.nextInt()) {
                case 1 -> studentView.create();
                case 2 -> studentView.getById();
                case 3 -> studentView.getAllStudents();
                case 4 -> teacherView.create();
                case 5 -> teacherView.getById();
                case 6 -> teacherView.getAllTeachers();
                case 7 -> studyGroupView.createStudyGroup();
                case 8 -> studyGroupView.getByIdGroup();
                case 9 -> studyGroupView.getAllGroups();
                case 10 -> System.exit(0);
            
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }
}
