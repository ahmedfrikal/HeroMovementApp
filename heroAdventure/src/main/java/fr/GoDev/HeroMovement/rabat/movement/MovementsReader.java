package fr.GoDev.HeroMovement.rabat.movement;

import java.io.IOException;

public interface MovementsReader {
    String readMovements(String filename) throws IOException;
}
