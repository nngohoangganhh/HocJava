package oop.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nhập tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập tuổi: ");
            int age = sc.nextInt();

            Student student = new Student(id, name, age);
            System.out.println("Tạo sinh viên thành công:");
            System.out.println(student);

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi dữ liệu: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
