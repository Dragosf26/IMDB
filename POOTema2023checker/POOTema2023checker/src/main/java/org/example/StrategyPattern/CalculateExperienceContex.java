package POOTema2023checker.POOTema2023checker.src.main.java.org.example.StrategyPattern;

import POOTema2023checker.POOTema2023checker.src.main.java.org.example.Interfaces.ExperienceStrategy;

public class CalculateExperienceContex {
    private ExperienceStrategy experienceStrategy;


    public void setExperienceStrategy(ExperienceStrategy experienceStrategy) {
        this.experienceStrategy = experienceStrategy;
    }

    public int calculateExp() {
        return experienceStrategy.calculateExperience();
    }
}
