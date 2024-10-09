package entity;

import exception.TooColdException;
import exception.TooHotException;
import exception.UnusualTasteException;

public class VirtualCafe {
    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup) throws UnusualTasteException, TooHotException, TooColdException {
        cust.drinkCoffee(cup);
        System.out.println("Coffee tastes just right.");
    }
}
