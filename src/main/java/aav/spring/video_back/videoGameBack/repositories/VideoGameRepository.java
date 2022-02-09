package aav.spring.video_back.videoGameBack.repositories;

import aav.spring.video_back.videoGameBack.domain.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Alejandro Arango
 */
@Repository
public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {


    List<VideoGame> findAllByCategory(String category);

    VideoGame findById(int id);

}