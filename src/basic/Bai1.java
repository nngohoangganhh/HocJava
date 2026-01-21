package basic;

import java.util.Scanner;

//
//Nhập số nguyên n
//Tính tổng 1 + 2 + ... + n
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số n:");
        int n = sc.nextInt();sc.nextLine();
        int sum = 0;
        for (int i = 0 ; i<= n; i++){
            sum+=i;
        }
        System.out.println("Tổng là "+ sum);
        sc.close();
        return;
        // HOÀNG ANH NGÔ
    }
}
