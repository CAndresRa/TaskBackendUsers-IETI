package edu.escuelaing.ieti.task.services;

import edu.escuelaing.ieti.task.entities.User;
import java.util.List;

public interface UserService {

    /**
     * get all users in system
     * @return List with users
     */
    List<User> getAll();

    /**
     * Get user by id
     * @param userId user id
     * @return user id
     */
    User getById(String userId);

    /**
     * Create user
     * @param user user
     * @return user
     */
    User create(User user);

    /**
     * Update user
     * @param user user
     * @return User
     */
    User update(User user);

    /**
     * Delete user
     * @param userId user id
     */
    void remove(String userId);
}
