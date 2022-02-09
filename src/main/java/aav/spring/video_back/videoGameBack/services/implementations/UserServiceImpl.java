package aav.spring.video_back.videoGameBack.services.implementations;

import aav.spring.video_back.videoGameBack.domain.Role;
import aav.spring.video_back.videoGameBack.domain.User;
import aav.spring.video_back.videoGameBack.repositories.RoleRepository;
import aav.spring.video_back.videoGameBack.repositories.UserRepository;
import aav.spring.video_back.videoGameBack.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alejandro Arango
 */
@Service @RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role saveRol(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
