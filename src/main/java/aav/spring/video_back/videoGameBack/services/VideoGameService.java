package aav.spring.video_back.videoGameBack.services;

import aav.spring.video_back.videoGameBack.domain.VideoGame;

import java.util.List;

/**
 * @author Alejandro Arango
 */

public interface VideoGameService {
    List<VideoGame> list();

    VideoGame getVideoGame(int id);

    VideoGame add(VideoGame videogame);
    VideoGame edit(VideoGame videogame);
    VideoGame delete(int id);
}
