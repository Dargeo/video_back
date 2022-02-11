package aav.spring.video_back.videoGameBack.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Alejandro Arango
 */
@Entity
@EnableAutoConfiguration
@Table(name = "users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;


    @ManyToMany(fetch = FetchType.EAGER)
    @Column
    private Collection<Role> roles = new ArrayList<>();
}
