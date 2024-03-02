package POOTema2023checker.POOTema2023checker.src.main.java.org.example.StrategyPattern;

import POOTema2023checker.POOTema2023checker.src.main.java.org.example.Interfaces.ExperienceStrategy;

public class RequestStrategy implements ExperienceStrategy {

    int experience;

    public RequestStrategy(int experience) {
        this.experience = experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int calculateExperience() {
        experience += 2;
        return experience;
    }
}
