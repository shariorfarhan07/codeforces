package A;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if (luckyNumber(a)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
    public static boolean luckyNumber(String s){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='7'|| s.charAt(i)=='4'){count++;}
        }
        if (count==4||count==7){
            return true;
        }else {
            return false;
        }
    }
}
