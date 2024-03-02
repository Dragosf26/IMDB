package POOTema2023checker.POOTema2023checker.src.main.java.org.example.Interfaces;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserversRating(String notification);

    void notifyObserversRequest();
}