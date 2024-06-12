package model.impl;


import model.User;

public class Teacher extends User {

    // private final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    // public void addGroupId(int id){ //должен быть в сервисе
    //     groups.add(id);
    // }
    
}
