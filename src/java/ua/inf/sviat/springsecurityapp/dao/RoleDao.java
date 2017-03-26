package ua.inf.sviat.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.inf.sviat.springsecurityapp.model.Role;

/**
 * Created by Sviatoslav on 25.03.2017.
 */
public interface RoleDao extends JpaRepository<Role, Long> {
}
