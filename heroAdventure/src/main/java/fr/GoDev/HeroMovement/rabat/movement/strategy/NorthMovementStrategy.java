package fr.GoDev.HeroMovement.rabat.movement.strategy;

import fr.GoDev.HeroMovement.rabat.model.Hero;

public class NorthMovementStrategy implements MovementStrategy {

    @Override
    public void execute(Hero hero, char[][] map) {
        if (hero.getX() > 0 && map[hero.getX() - 1][hero.getY()] == ' ') {
            hero.setX(hero.getX() - 1);
        }
    }
}