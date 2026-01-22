package oop.bai5;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public void getSalary() {
        System.out.println();
    }
}
