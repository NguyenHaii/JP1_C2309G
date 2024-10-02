package Controller;  // You may rename this to `model` if you prefer

import Service.StaffService;

public class ManagerController extends StaffService {
    private double allowance;

    public ManagerController(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    @Override
    public double getPaid() {
        return salary + allowance;
    }

    @Override
    public String toString() {
        return "Manager: " + name + ", Salary: " + salary + ", Allowance: " + allowance + ", Paid: " + getPaid();
    }
}
