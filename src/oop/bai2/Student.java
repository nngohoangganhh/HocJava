package oop.bai2;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID phải > 0");
        }
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được rỗng hoặc null");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Tuổi phải từ 0 đến 120");
        }
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}
