package fr.GoDev.HeroMovement.rabat.movement.strategy;

import fr.GoDev.HeroMovement.rabat.model.Hero;

public class EastMovementStrategy  implements MovementStrategy {
    @Override
    public void execute(Hero hero, char[][] map) {
        if (hero.getY() < map[0].length - 1 && map[hero.getX()][hero.getY() + 1] == ' ') {
            hero.setY(hero.getY() + 1);
        }
    }
}