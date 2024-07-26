package fr.GoDev.HeroMovement.rabat;

import fr.GoDev.HeroMovement.rabat.application.ApplicationService;
import fr.GoDev.HeroMovement.rabat.factory.ConcreteFactory;
import fr.GoDev.HeroMovement.rabat.factory.Factory;

public class App {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        ApplicationService applicationService = new ApplicationService(factory);
        applicationService.run();
    }
}
