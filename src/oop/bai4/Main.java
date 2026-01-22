package oop.bai4;

import oop.bai3.Person;
import oop.bai3.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person tc= new Teacher(123,"hoàng anh",18,18000);
        Person st = new Student(145,"ANH ngô",20,"MSV123");
        List<Person> ps = new ArrayList<>();
        ps.add(tc);
        ps.add(st);
        for (Person P :ps){
            System.out.println(P);
        }
    }
}
