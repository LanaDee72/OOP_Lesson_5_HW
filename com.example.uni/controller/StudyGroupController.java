package controller;

import java.util.List;

import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.StudyGroupServise;

public class StudyGroupController {
    
    private StudyGroupServise service = new StudyGroupServise();

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students){
        return service.createStudyGroup(teacher, students);
    }

    public List<StudyGroup> getAllGroups(){
        return service.getAllGroups();
    }

    public StudyGroup getByIdGroup(int id){
        StudyGroup studyGroup = null;
        try{
            studyGroup = service.getByIdGroup(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return studyGroup;
    }
}
