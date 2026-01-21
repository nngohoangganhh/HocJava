package basic;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số nguyên n:");
        int n = scanner.nextInt();scanner.nextLine();
        if(n % 2== 0){
            System.out.println(  n +  " là số chắn");
        }else {
            System.out.println(  n + " là số lẻ ");
        }
        scanner.close();
    }
}
