package aav.spring.video_back.videoGameBack.repositories;

import aav.spring.video_back.videoGameBack.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alejandro Arango
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
