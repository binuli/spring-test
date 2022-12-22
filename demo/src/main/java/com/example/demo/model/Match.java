package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "match")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    @Column(name = "ball")
    private String ball;

    @Column(name = "inning")
    private int inning;

    @Column(name = "team")
    private String team;

    @Column(name = "batsman")
    private String batsman;

    @Column(name = "non_striker")
    private String non_striker;

    @Column(name = "bowler")
    private String bowler;

    @Column(name = "runs_off_bat")
    private int runs_off_bat;

    @Column(name = "extras")
    private int extras;

    @Column(name = "wides")
    private int wides;

    @Column(name = "no_balls")
    private int no_balls;

    @Column(name = "byes")
    private int byes;

    @Column(name = "leg_byes")
    private int leg_byes;

    @Column(name = "wicket_type")
    private String wicket_type;

    @Column(name = "dismissed_player")
    private String dismissed_player;
}
