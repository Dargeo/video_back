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
@Table(name = "roles")
@EnableAutoConfiguration
@Getter @Setter @NoArgsConstructor @AllArgsConstructor

public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;


}
