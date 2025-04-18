package test;

import domain.Lizard;

public class TestAnimal {

    public static void main(String[] args) {
        Lizard lizard = new Lizard("Mason");
        System.out.println(lizard);
        lizard.hunt();
        lizard.eat();
        lizard.recommendedTemp();
    }
}
