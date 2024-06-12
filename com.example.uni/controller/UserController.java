package controller;

import model.User;


public interface UserController {
    User create(String name, String lastName);
    User getById(int id);
}
