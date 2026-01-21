package basic;

import java.util.Scanner;

//
//Nhập số n
//
//Kiểm tra n có phải số nguyên tố không
public class Bai3 {

    public static boolean isPrime(int n) {
        // Các số nhỏ hơn 2 không phải là số nguyên tố
        if (n < 2) return false;

        // Kiểm tra từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu chia hết cho bất kỳ số nào, không phải là số nguyên tố
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int number = sc.nextInt();sc.nextLine();
        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
        // HOÀNG ANH NGÔ
    }
}


