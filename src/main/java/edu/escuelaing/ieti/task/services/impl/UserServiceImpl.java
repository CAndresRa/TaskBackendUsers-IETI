package edu.escuelaing.ieti.task.services.impl;

import edu.escuelaing.ieti.task.entities.User;
import edu.escuelaing.ieti.task.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAll() {
        //Debido a que el enunciado no requiere persistencia en base de datos externa genero la simulacion
        //De los usuarios en el sistema de la siguiente manera...

        List<User> users = new ArrayList<>();

        User a = new User("Andres", "andres@gmail.com", "xxxxxxx");
        User b = new User("Carlos", "carlos@gmail.com", "xxxxxxx");
        User c = new User("Natalia", "natalia@gmail.com", "xxxxxxx");
        User d = new User("Pepito", "pepito@gmail.com", "xxxxxxx");
        User e = new User("Pepita", "pepita@gmail.com", "xxxxxxx");

        users.add(a);
        users.add(b);
        users.add(c);
        users.add(d);
        users.add(e);

        return users;
    }

    @Override
    public User getById(String userId) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void remove(String userId) {

    }

}
