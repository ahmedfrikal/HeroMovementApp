package fr.GoDev.HeroMovement.rabat.movement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class FileMovementsReader implements MovementsReader {
    @Override
    public String readMovements(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull
                                                     (getClass().getResourceAsStream(filename))))) {
            br.readLine();
            return br.readLine();
        }
    }
}
