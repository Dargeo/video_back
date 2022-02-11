package aav.spring.video_back.videoGameBack.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

/**
 * @author Alejandro Arango
 */
@Entity
@Table(name = "videogames")
@EnableAutoConfiguration
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class VideoGame {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String imagepath;

    @Column
    private String category;

    @Column
    private int price;

    @Column
    private String pg;
}
