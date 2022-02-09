package aav.spring.video_back.videoGameBack.controller;

import aav.spring.video_back.videoGameBack.domain.VideoGame;
import aav.spring.video_back.videoGameBack.services.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Alejandro Arango
 */
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/videogames"})
public class VideoGameController {

    @Autowired
    VideoGameService service;


    @GetMapping
    public List<VideoGame>list(){
        System.out.println(service.listVideoGames());
        return service.listVideoGames();
    }


    @PostMapping({"/"})
    public VideoGame add(@RequestBody VideoGame videoGame){
        return service.saveVideoGame(videoGame);
    }

    @GetMapping(path = {"/{id}"})
    public VideoGame getVideogame(@PathVariable("id") int id) {
        return service.getVideoGame(id);
    }



    @PutMapping(path = {"/{id}"})
    public VideoGame edit(@RequestBody VideoGame videoGame, @PathVariable("id") int id) {
        videoGame.setId(id);
        return service.editVideoGame(videoGame);
    }


    @DeleteMapping(path = {"/{id}"})
    public VideoGame delete(@PathVariable("id") int id){
        return service.deleteVideoGame(id);
    }

    @GetMapping(path = {"/category/{category}"})
    public List<VideoGame> findByCategory(@PathVariable("category") String category){return service.listVideoGamesByCategory(category); }

}
