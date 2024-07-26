package fr.GoDev.HeroMovement.rabat.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class FileMapLoader implements MapLoader{

    @Override
    public char[][] loadMap(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(filename))))) {
            StringBuilder sb = new StringBuilder();
            String line;
            int rows = 0;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
                rows++;
            }
            String[] lines = sb.toString().split("\n");
            int cols = lines[0].length();
            char[][] map = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                map[i] = lines[i].toCharArray();
            }
            return map;
        }
    }
}
