package oop.bai4;

import oop.bai3.Person;

public class Student extends Person {
    private String studentCode;
    public Student(int id, String name , int age, String studentCode){
        super(id, name, age);
        this.studentCode=studentCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
@Override
public String toString() {
    return "Student{" + super.toString() + ", studentCode='" + studentCode + "'}";
}

}
