package basic;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left  = 0;
        int right = s.length()-1;
        boolean isPalindrome = true;
        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                isPalindrome= false;
              break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println(" chuỗi là palindrome ");
        }else {
            System.out.println("chuỗi không phải palindrome");
        }
        System.out.println(s.charAt(left));
        System.out.println(s.charAt(right));
    }
}
