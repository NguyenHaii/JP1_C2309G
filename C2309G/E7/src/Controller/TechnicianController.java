package Controller;  // You may rename this to `model` if you prefer

import Service.StaffService;

public class TechnicianController extends StaffService {
    private double overtimePay;

    public TechnicianController(String name, double salary, double overtimePay) {
        super(name, salary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double getPaid() {
        return salary + overtimePay;
    }

    @Override
    public String toString() {
        return "Technician: " + name + ", Salary: " + salary + ", Overtime Pay: " + overtimePay + ", Paid: " + getPaid();
    }
}
