package fr.GoDev.HeroMovement.rabat;

import fr.GoDev.HeroMovement.rabat.application.ApplicationService;
import fr.GoDev.HeroMovement.rabat.factory.ConcreteFactory;
import fr.GoDev.HeroMovement.rabat.model.Hero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationServiceTest {
    private ApplicationService applicationService;

    @BeforeEach
    public void setUp() {
        ConcreteFactory factory = new ConcreteFactory();
        applicationService = new ApplicationService(factory);
    }

    @Test
    void testRun() throws IOException {

        String mapPath = "/carte.txt";
        String movementsPath = "/move.txt";

        char[][] map = applicationService.getMapLoader().loadMap(mapPath);
        int[] initialPosition = applicationService.getInitialPositionReader().readInitialPosition(movementsPath);
        Hero hero = new Hero(initialPosition[0], initialPosition[1]);
        String movements = applicationService.getMovementsReader().readMovements(movementsPath);

        applicationService.getHeroMovement().moveHero(hero, map, movements);

        assertEquals(7, hero.getX());
        assertEquals(5, hero.getY());
    }
}
