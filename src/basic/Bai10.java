package basic;

import java.util.Scanner;

public class Bai10 {
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
//        System.out.println("các phần tử trong mảng là:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("arr[" + i + "] :" + arr[i]);
//        }

        int secondMax = Integer.MIN_VALUE;
        int max =  arr[0];
        for (int i = 1; i < n; i++) {
            int x = arr[i];
             if(x > max){
                secondMax = max;
                max= x;
             }else if (x < max && x > secondMax){
                 secondMax= x;
             }
        }
       if (secondMax == Integer.MIN_VALUE){
       System.out.println("không ton tai số thu 2");
       }else {
           System.out.println("sô thứ nhất "+max);
           System.out.println("số thứ hai lớn nhất "+secondMax);
       }
       scanner.close();
    }
}
