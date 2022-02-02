package aav.spring.video_back.videoGameBack.repositories;

import aav.spring.video_back.videoGameBack.domain.VideoGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Alejandro Arango
 */
@Repository
public interface VideoGameRepository extends CrudRepository<VideoGame, Long> {
    List<VideoGame> findAll();
    VideoGame findById(int id);
    VideoGame save(VideoGame videogame);
    void delete(VideoGame videoGame);
}