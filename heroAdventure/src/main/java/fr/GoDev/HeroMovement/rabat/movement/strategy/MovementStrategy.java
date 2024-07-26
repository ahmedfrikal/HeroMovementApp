package fr.GoDev.HeroMovement.rabat.movement.strategy;

import fr.GoDev.HeroMovement.rabat.model.Hero;

public interface MovementStrategy {
    void execute(Hero hero, char[][] map) throws IllegalArgumentException;
}
