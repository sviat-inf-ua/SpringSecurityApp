package ua.inf.sviat.springsecurityapp.service;

import ua.inf.sviat.springsecurityapp.model.User;

/**
 * Created by Sviatoslav on 25.03.2017.
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
