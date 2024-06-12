package service;

import java.util.List;

import model.db.DataBase;
import model.impl.Student;

public class StudentService implements UserService {


    @Override
    public Student create(String name, String lastName) {
        int id;
        int size = DataBase.studentDB.size();
        if(size == 0){
            id = 1;
        } else{
            id = size + 1;
        }
        Student student = new Student(id, name, lastName);
        DataBase.studentDB.add(student);
        return student;
    }


    public List<Student> getAll() {
        return DataBase.studentDB;
    }

    @Override
    public Student getById(int id) throws Exception {
        Student student = DataBase.studentDB //Список студентов
            .stream() // запускаем поток с данными для вычисления
            .filter(s -> s.getId() == id) // вызываем метод filter фильтруя по условию
            .findFirst() // вернуть первого найденного студента
            .orElse(null); // если не нашли, вернуть null // orElse закрывает stream
        if(student == null){
            throw new Exception("Студент не найден"); // выбрасываем проверяемое исключение 
        }
        return student;
    }
    
}
