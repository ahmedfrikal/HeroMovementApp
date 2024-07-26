package fr.GoDev.HeroMovement.rabat.position;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class FileInitialPositionReader implements InitialPositionReader {
    @Override
    public int[] readInitialPosition(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(filename))))) {
            String[] initialPosition = br.readLine().split(",");
            int x = Integer.parseInt(initialPosition[0]);
            int y = Integer.parseInt(initialPosition[1]);
            return new int[]{x, y};
        }
    }
}
