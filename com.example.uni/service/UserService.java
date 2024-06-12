package service;

import model.User;


public interface UserService {
    User create(String name, String lastName);
    User getById(int id) throws Exception;
}
