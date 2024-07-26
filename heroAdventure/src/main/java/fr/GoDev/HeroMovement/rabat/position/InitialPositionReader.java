package fr.GoDev.HeroMovement.rabat.position;

import java.io.IOException;

public interface InitialPositionReader {
    int[] readInitialPosition(String filename) throws IOException;
}
