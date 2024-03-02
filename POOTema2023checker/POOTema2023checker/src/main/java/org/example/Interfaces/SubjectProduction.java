package POOTema2023checker.POOTema2023checker.src.main.java.org.example.Interfaces;

public interface SubjectProduction {

    void addObserverProduction(ObserverProduction observer);

    void removeObserverProduction(ObserverProduction observer);

    void notifyObserversProduction();
}
