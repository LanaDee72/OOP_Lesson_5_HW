package service;

import java.util.List;

import model.StudyGroup;
import model.db.DataBase;
import model.impl.Student;
import model.impl.Teacher;

public class StudyGroupServise {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students){
        int id;
        int size = DataBase.studyGroupDB.size();
        if(size == 0){
            id = 1;
        } else{
            id = size + 1;
        }
        StudyGroup studyGroup = new StudyGroup(id, teacher, students);
        DataBase.studyGroupDB.add(studyGroup);
        return studyGroup;
    }

    public List<StudyGroup> getAllGroups() {
        return DataBase.studyGroupDB;
    }

    public StudyGroup getByIdGroup(int id) throws Exception {
        StudyGroup studyGroup = DataBase.studyGroupDB //Список групп
            .stream() // запускаем поток с данными для вычисления
            .filter(s -> s.getId() == id) // вызываем метод filter фильтруя по условию
            .findFirst() // вернуть первую найденную группу
            .orElse(null); // если не нашли, вернуть null // orElse закрывает stream
        if(studyGroup == null){
            throw new Exception("Группа не найдена"); // выбрасываем проверяемое исключение 
        }
        return studyGroup;
    }

    
}
