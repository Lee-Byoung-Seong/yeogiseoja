package com.flab.yeogiseoja.domain.accommodation.location;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.jar.JarEntry;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class City {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id")
    private State state;

    public City(String name, State state) {
        this.name = name;
        this.state = state;
    }
}
