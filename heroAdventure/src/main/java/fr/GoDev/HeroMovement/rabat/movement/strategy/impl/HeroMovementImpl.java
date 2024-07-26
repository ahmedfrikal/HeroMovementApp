package fr.GoDev.HeroMovement.rabat.movement.strategy.impl;

import fr.GoDev.HeroMovement.rabat.model.Hero;
import fr.GoDev.HeroMovement.rabat.movement.HeroMovement;
import fr.GoDev.HeroMovement.rabat.movement.strategy.*;

import java.util.HashMap;
import java.util.Map;

public class HeroMovementImpl implements HeroMovement {
    private final Map<Character, MovementStrategy> strategyMap = new HashMap<>();

    public HeroMovementImpl() {
        strategyMap.put('N', new NorthMovementStrategy());
        strategyMap.put('S', new SouthMovementStrategy());
        strategyMap.put('E', new EastMovementStrategy());
        strategyMap.put('O', new WestMovementStrategy());
    }

    @Override
    public void moveHero(Hero hero, char[][] map, String movements) {
        for (char move : movements.toCharArray()) {
            MovementStrategy strategy = strategyMap.get(move);
            if (strategy != null) {
                strategy.execute(hero, map);
            }
            else {
                System.err.println("Impossible de deplacer le Hero");
            }
        }
    }
}