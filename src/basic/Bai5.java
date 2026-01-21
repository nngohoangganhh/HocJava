package basic;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tự nhiên n: ");
        int n = scanner.nextInt();scanner.nextLine();
        int original = n ;
        boolean isNagetive = false;
        if(n < 0){
            isNagetive = true;
            n = Math.abs(n);
        }
        int resserse = 0;
        if (n == 0){
            resserse = 0;
        }else {
                while (n > 0){
                    int digit = n %10;
                    resserse = resserse * 10 + digit;
                    n = n /10;
                }
        }
        if(isNagetive){
            resserse = -resserse;
        }
        System.out.println(" số đảo ngược của " +n +" là :12" + resserse );
      scanner.close();
    }
}
