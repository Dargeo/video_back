package aav.spring.video_back.videoGameBack.services;

import aav.spring.video_back.videoGameBack.domain.Role;
import aav.spring.video_back.videoGameBack.domain.User;

import java.util.List;

/**
 * @author Alejandro Arango
 */
public interface UserService {


    User saveUser(User user);
    Role saveRol(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
