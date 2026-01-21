//package basic;
//
//import java.util.Scanner;
//
////Nhập số nguyên n
////
////Đếm số chữ số
//public class bai4 {
//    public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////        System.out.println("Nhập vào số n:");
////        int n = sc.nextInt();sc.nextLine();
////        int count = 0;
////        while (n > 0){
////          n = n / 10;
////            count++;
////        }
////        System.out.print( " số " + n + " có " +count + " chữ số ");
////        sc.close();
//
//    }
//}

package basic;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số n:");
        int n = scanner.nextInt();

        // Lưu giá trị gốc
        int original = n;

        // Xử lý số âm
        int temp = Math.abs(n);

        int count = 0;

        // Trường hợp đặc biệt: n = 0
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Số " + original + " có " + count + " chữ số");

        scanner.close();
    }
}
