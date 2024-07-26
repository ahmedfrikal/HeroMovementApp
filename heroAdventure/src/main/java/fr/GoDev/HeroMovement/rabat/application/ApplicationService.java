package fr.GoDev.HeroMovement.rabat.application;

import fr.GoDev.HeroMovement.rabat.factory.Factory;
import fr.GoDev.HeroMovement.rabat.loader.MapLoader;
import fr.GoDev.HeroMovement.rabat.model.Hero;
import fr.GoDev.HeroMovement.rabat.movement.HeroMovement;
import fr.GoDev.HeroMovement.rabat.movement.MovementsReader;
import fr.GoDev.HeroMovement.rabat.position.InitialPositionReader;
import fr.GoDev.HeroMovement.rabat.utils.YamlPropertiesLoader;
import lombok.Getter;

import java.io.IOException;

@Getter
public class ApplicationService {
    private final MapLoader mapLoader;
    private final InitialPositionReader initialPositionReader;
    private final MovementsReader movementsReader;
    private final HeroMovement heroMovement;

    public ApplicationService(Factory factory) {
        this.mapLoader = factory.createMapLoader();
        this.initialPositionReader = factory.createInitialPositionReader();
        this.movementsReader = factory.createMovementsReader();
        this.heroMovement = factory.createHeroMovement();
    }
    public void run() {
        try {
            YamlPropertiesLoader propertiesLoader = new YamlPropertiesLoader("/config.yml");
            String mapPath = propertiesLoader.getProperty("map");
            String movementsPath = propertiesLoader.getProperty("movements");

            char[][] map = mapLoader.loadMap(mapPath);
            int[] initialPosition = initialPositionReader.readInitialPosition(movementsPath);
            Hero hero = new Hero(initialPosition[0], initialPosition[1]);
            String movements = movementsReader.readMovements(movementsPath);

            heroMovement.moveHero(hero, map, movements);

            System.out.println("Le personnage doit se trouver en (" + hero.getX() + "," + hero.getY() + ")");
        } catch (IOException e) {
            System.out.println("Le personnage ne peut pas deplacer");
        }
    }
}
