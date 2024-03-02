package POOTema2023checker.POOTema2023checker.src.main.java.org.example;

import POOTema2023checker.POOTema2023checker.src.main.java.org.example.Exceptions.InvalidCommandException;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InvalidCommandException {
        IMDB imdb = IMDB.getInstance();
        imdb.run();
    }
}
