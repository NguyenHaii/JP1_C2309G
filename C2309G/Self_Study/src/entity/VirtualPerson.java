package entity;

import exception.TooColdException;
import exception.TooHotException;
import exception.UnusualTasteException;

public class VirtualPerson {
    private static final int tooCold = 65;
    private static final int tooHot = 85;
    private static final int unusualTasteThreshold = 77;

    public void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException, UnusualTasteException {
        int temperature = cup.getTemperature();
        if (temperature <= tooCold) {
            throw new TooColdException(temperature);
        } else if (temperature >= tooHot) {
            throw new TooHotException(temperature);
        } else if (temperature == unusualTasteThreshold) {
            throw new UnusualTasteException("This coffee tastes like tea.");
        }
        System.out.println("Coffee is just right.");
    }
}
