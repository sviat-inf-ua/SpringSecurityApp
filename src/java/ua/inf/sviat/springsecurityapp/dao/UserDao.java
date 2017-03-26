package ua.inf.sviat.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.inf.sviat.springsecurityapp.model.User;

/**
 * Created by Sviatoslav on 25.03.2017.
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
