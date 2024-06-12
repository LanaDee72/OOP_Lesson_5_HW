package service;

import java.util.List;

import model.db.DataBase;
import model.impl.Teacher;

public class TeacherService implements UserService{

    @Override
    public Teacher create(String name, String lastName) {
        int id;
        int size = DataBase.techerDB.size();
        if(size == 0){
            id = 1;
        } else{
            id = size + 1;
        }
        Teacher teacher = new Teacher(id, name, lastName);
        DataBase.techerDB.add(teacher);
        return teacher;
    }

    @Override
    public Teacher getById(int id) throws Exception {
        Teacher teacher = DataBase.techerDB //Список учителей
            .stream() // запускаем поток с данными для вычисления
            .filter(s -> s.getId() == id) // вызываем метод filter фильтруя по условию
            .findFirst() // вернуть первого найденного учителя
            .orElse(null); // если не нашли, вернуть null // orElse закрывает stream
        if(teacher == null){
            throw new Exception("Учитель не найден"); // выбрасываем проверяемое исключение 
        }
        return teacher;
    }

    public List<Teacher> getAll() {
        return DataBase.techerDB;
    }
    
}
