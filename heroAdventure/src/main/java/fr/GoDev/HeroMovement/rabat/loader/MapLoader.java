package fr.GoDev.HeroMovement.rabat.loader;

import java.io.IOException;

public interface MapLoader {
    char[][] loadMap(String filename) throws IOException;
}
