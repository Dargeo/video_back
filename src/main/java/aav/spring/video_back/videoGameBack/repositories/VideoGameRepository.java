package aav.spring.video_back.videoGameBack.repositories;

import aav.spring.video_back.videoGameBack.domain.VideoGame;
import org.springframework.data.jpa.repository.Query;
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


    @Query("SELECT v FROM VideoGame v WHERE v.category = ?1")
    List<VideoGame> findAllByCategory(String category);


}