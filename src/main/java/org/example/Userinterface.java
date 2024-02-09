package org.example;

import java.util.List;

public interface Userinterface  {

    void addUser();

    List<User> readUser(Long id);

    void editUser(Long id , User user);
    void  delete(Long id);

}
