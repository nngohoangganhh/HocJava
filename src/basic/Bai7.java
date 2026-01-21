package basic;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử trong mảng:");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        System.out.print(" nhập vào các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print(" arr[" + i + "]:");
            arr[i] = scanner.nextInt();
        }
        System.out.println("các phần tử trong mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] :" + arr[i]);
        }
        System.out.println("nhập số cần đếm:");
        int x = scanner.nextInt();scanner.nextLine();
        int dem=0;
        for (int i =0 ; i < n ; i++){
            if (arr[i]== x ){
                dem++;
            }
        }
        System.out.println("số lượng phần tử "+x+ " là : "+ dem);
        System.out.println("by Hoàng Anh Ngô");
    }
}
