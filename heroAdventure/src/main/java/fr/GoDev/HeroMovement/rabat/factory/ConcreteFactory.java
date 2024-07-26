package fr.GoDev.HeroMovement.rabat.factory;

import fr.GoDev.HeroMovement.rabat.loader.FileMapLoader;
import fr.GoDev.HeroMovement.rabat.loader.MapLoader;
import fr.GoDev.HeroMovement.rabat.movement.FileMovementsReader;
import fr.GoDev.HeroMovement.rabat.movement.HeroMovement;
import fr.GoDev.HeroMovement.rabat.movement.MovementsReader;
import fr.GoDev.HeroMovement.rabat.movement.strategy.impl.HeroMovementImpl;
import fr.GoDev.HeroMovement.rabat.position.FileInitialPositionReader;
import fr.GoDev.HeroMovement.rabat.position.InitialPositionReader;

public class ConcreteFactory implements Factory {
    @Override
    public MapLoader createMapLoader() {
        return new FileMapLoader();
    }

    @Override
    public InitialPositionReader createInitialPositionReader() {
        return new FileInitialPositionReader();
    }

    @Override
    public MovementsReader createMovementsReader() {
        return new FileMovementsReader();
    }

    @Override
    public HeroMovement createHeroMovement() {
        return new HeroMovementImpl();
    }
}
