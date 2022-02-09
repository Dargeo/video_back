package aav.spring.video_back.videoGameBack.services.implementations;

import aav.spring.video_back.videoGameBack.domain.VideoGame;
import aav.spring.video_back.videoGameBack.repositories.VideoGameRepository;
import aav.spring.video_back.videoGameBack.services.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public List<VideoGame> listVideoGames() {
        return videoGameRepository.findAll();
    }

    @Override
    public VideoGame getVideoGame(int id) {
        return videoGameRepository.findById(id);
    }

    @Override
    public VideoGame saveVideoGame(VideoGame videogame) {
        return videoGameRepository.save(videogame);
    }

    @Override
    public VideoGame editVideoGame(VideoGame videogame) {
        return videoGameRepository.save(videogame);
    }

    @Override
    public VideoGame deleteVideoGame(int id) {
        VideoGame videogame = videoGameRepository.findById(id);
        videoGameRepository.delete(videogame);

        return videogame;

    }

    @Override
    public List<VideoGame> listVideoGamesByCategory(String category) {

        return videoGameRepository.findAllByCategory(category);
    }

    @Override
    public Page<VideoGame> listVideoGamesPagination(int offset, int limit) {
        Page<VideoGame> products = videoGameRepository.findAll(PageRequest.of(offset,limit));
        return products;
    }
}
