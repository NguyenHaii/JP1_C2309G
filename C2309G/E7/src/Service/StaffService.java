package Service;

import Entity.Staff;

public abstract class StaffService extends Staff {
    public StaffService(String name, double salary) {
        super(name, salary);
    }

    // Abstract methods to be implemented by subclasses
    public abstract double getPaid();

    @Override
    public abstract String toString();
}
