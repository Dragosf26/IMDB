package POOTema2023checker.POOTema2023checker.src.main.java.org.example.Interfaces;

import POOTema2023checker.POOTema2023checker.src.main.java.org.example.Actor;
import POOTema2023checker.POOTema2023checker.src.main.java.org.example.Production;

public interface StaffInterface {
    void addProductionSystem(Production p);

    void addActorSystem(Actor a);

    void removeProductionSystem(String name);

    void removeActorSystem(String name);

    void updateProduction(Production p);

    void updateActor(Actor a);

    void resolveUserRequests();
}
