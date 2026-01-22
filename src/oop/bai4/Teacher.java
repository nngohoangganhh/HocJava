package oop.bai4;

import oop.bai3.Person;

public class Teacher extends Person {
    private double salary;
    public Teacher(int id, String name , int age, double salary){
        super(id, name, age);
        this.salary=salary;
    }

   @Override
     public String toString() {
     return "Teacher{" + super.toString() + ", salary=" + salary + "}";
     }

}
