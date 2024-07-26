package fr.GoDev.HeroMovement.rabat.factory;

import fr.GoDev.HeroMovement.rabat.loader.MapLoader;
import fr.GoDev.HeroMovement.rabat.movement.HeroMovement;
import fr.GoDev.HeroMovement.rabat.movement.MovementsReader;
import fr.GoDev.HeroMovement.rabat.position.InitialPositionReader;

public interface Factory {
    MapLoader createMapLoader();
    InitialPositionReader createInitialPositionReader();
    MovementsReader createMovementsReader();
    HeroMovement createHeroMovement();
}
