package oop.bai1;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Hiển thị thông tin
    public void showInfo() {
        System.out.println(
                "Học sinh có id là: " + id +
                ", tên là: " + name +
                ", tuổi là: " + age
        );
    }
}
