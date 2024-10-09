import entity.CoffeeCup;
import entity.VirtualPerson;
import entity.VirtualCafe;
import exception.UnusualTasteException;

public class Main {
    public static void main(String[] args) {
        CoffeeCup cup = new CoffeeCup();
        cup.setTemperature(77);

        VirtualPerson cust = new VirtualPerson();
        try {
            VirtualCafe.serveCustomer(cust, cup);
        } catch (UnusualTasteException e) {
            System.out.println("This coffee has an unusual taste: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
