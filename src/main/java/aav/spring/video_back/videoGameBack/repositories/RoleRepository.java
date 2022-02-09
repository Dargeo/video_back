package aav.spring.video_back.videoGameBack.repositories;

import aav.spring.video_back.videoGameBack.domain.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alejandro Arango
 */
public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);

}
