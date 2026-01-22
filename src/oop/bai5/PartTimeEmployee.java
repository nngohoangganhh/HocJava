package oop.bai5;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int workingHours;

    public PartTimeEmployee(int id, String name, double hourlyRate, int workingHours) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public void getSalary() {

    }
}