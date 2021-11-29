package A;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a,b,max=0,pIntram = 0;
        for (int i = 0; i <n ; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            pIntram=pIntram-a+b;
           // System.out.println(pIntram+" "+a+" "+b);
            max=Math.max(pIntram,max);
        }
        System.out.println(max);
    }
}
