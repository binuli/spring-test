package com.example.demo.controller;

import com.example.demo.model.Match;
import com.example.demo.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MatchController {
    @Autowired
    MatchRepository matchRepository;

    @RequestMapping(value="/matches", method= RequestMethod.GET)
    public List<Match> readMatches() {
        return matchRepository.findAll();
    }

}
