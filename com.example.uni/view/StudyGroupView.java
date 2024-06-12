package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.StudentController;
import controller.StudyGroupController;
import controller.TeacherController;
import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudyGroupView {
    
    private StudyGroupController controller = new StudyGroupController();
    private StudentController studentController = new StudentController();
    private TeacherController teacherController = new TeacherController();

    public List<StudyGroup> getAllGroups(){
        List<StudyGroup> studyGroups = controller.getAllGroups();
        System.out.println(studyGroups);
        return studyGroups;
    }

    public StudyGroup createStudyGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел id студентов: ");
        String[] studentsId = scanner.nextLine().split(" ");
        System.out.println("Введите id учителя: ");
        int teacherId = scanner.nextInt();

        Teacher teacher = teacherController.getById(teacherId);
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentsId.length; i++) {
            students.add(studentController.getById(Integer.parseInt(studentsId[i])));
        }

        StudyGroup studyGroup = controller.createStudyGroup(teacher, students);
        System.out.println(studyGroup);
        return studyGroup;
    }

    public StudyGroup getByIdGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id группы: ");
        int id = scanner.nextInt();
        StudyGroup studyGroup = controller.getByIdGroup(id);
        System.out.println(studyGroup);
        return studyGroup;
    }
}
