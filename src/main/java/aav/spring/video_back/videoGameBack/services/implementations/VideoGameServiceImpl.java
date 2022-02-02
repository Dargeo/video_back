package aav.spring.video_back.videoGameBack.services.implementations;

import aav.spring.video_back.videoGameBack.domain.VideoGame;
import aav.spring.video_back.videoGameBack.repositories.VideoGameRepository;
import aav.spring.video_back.videoGameBack.services.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alejandro Arango
 */
@Service
public class VideoGameServiceImpl implements VideoGameService {


    @Autowired
    private VideoGameRepository videoGameRepository;


    @Override
    public List<VideoGame> list() {
        return videoGameRepository.findAll();
    }

    @Override
    public VideoGame getVideoGame(int id) {
        return videoGameRepository.findById(id);
    }

    @Override
    public VideoGame add(VideoGame videogame) {
        return videoGameRepository.save(videogame);
    }

    @Override
    public VideoGame edit(VideoGame videogame) {
        return videoGameRepository.save(videogame);
    }

    @Override
    public VideoGame delete(int id) {
        VideoGame videogame = videoGameRepository.findById(id);
        videoGameRepository.delete(videogame);

        return videogame;

    }
}
