package aav.spring.video_back.videoGameBack.services;

import aav.spring.video_back.videoGameBack.domain.VideoGame;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Alejandro Arango
 */

public interface VideoGameService {
    List<VideoGame> listVideoGames();

    VideoGame getVideoGame(int id);

    VideoGame saveVideoGame(VideoGame videogame);
    VideoGame editVideoGame(VideoGame videogame);
    VideoGame deleteVideoGame(int id);
    List<VideoGame> listVideoGamesByCategory(String category);
    Page<VideoGame> listVideoGamesPagination(int offset, int limit);

}
