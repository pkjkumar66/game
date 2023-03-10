package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameApplication.class, args);

        Game rockPaperScissors = Game.builder().build();
        rockPaperScissors.initialize();
        rockPaperScissors.start();

        System.out.println("Game ScoreCard: ");
        rockPaperScissors.printScoreCard();
    }

}