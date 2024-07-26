package fr.GoDev.HeroMovement.rabat;
import fr.GoDev.HeroMovement.rabat.model.Hero;
import fr.GoDev.HeroMovement.rabat.movement.HeroMovement;
import fr.GoDev.HeroMovement.rabat.movement.strategy.impl.HeroMovementImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class HeroMovementImplTest {
    @Test
    void testMoveHeroNorth() {
        char[][] map = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', 'H', ' '}
        };
        Hero hero = new Hero(2, 1);
        HeroMovement heroMovement = new HeroMovementImpl();
        heroMovement.moveHero(hero, map, "N");

        assertEquals(1, hero.getX());
        assertEquals(1, hero.getY());
    }

    @Test
    void testMoveHeroEast() {
        char[][] map = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', 'H', ' '}
        };
        Hero hero = new Hero(2, 1);
        HeroMovement heroMovement = new HeroMovementImpl();
        heroMovement.moveHero(hero, map, "E");

        assertEquals(2, hero.getX());
        assertEquals(2, hero.getY());
    }

    @Test
    void testMoveHeroSouth() {
        char[][] map = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'H', ' ', ' '}
        };
        Hero hero = new Hero(1, 1);
        HeroMovement heroMovement = new HeroMovementImpl();
        heroMovement.moveHero(hero, map, "S");

        assertEquals(2, hero.getX());
        assertEquals(1, hero.getY());
    }

    @Test
    void testMoveHeroWest() {
        char[][] map = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', 'H', ' '}
        };
        Hero hero = new Hero(2, 1);
        HeroMovement heroMovement = new HeroMovementImpl();
        heroMovement.moveHero(hero, map, "O");

        assertEquals(2, hero.getX());
        assertEquals(0, hero.getY());
    }
}
