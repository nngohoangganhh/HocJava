package oop.bai4;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name , int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id<=0){
              throw new IllegalArgumentException("ID phải > 0");
        }
        this.id=id;
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

//    @Override
//    public String toString() {
//        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
//
//    }
        @Override
       public String toString() {
          return "id=" + id + ", name='" + name + "', age=" + age;
       }

}

