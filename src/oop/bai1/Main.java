package oop.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        Student st = new Student(id, name, age);
        st.showInfo();
    }
}
