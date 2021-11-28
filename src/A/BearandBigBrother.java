package A;

import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int year=0,i=1;



            //System.out.println(babyA+" "+a+" "+b+" "+babyB);
         while (a<=b){
             year=i;
             a*=3;
             b*=2;
             i++;
        //     System.out.println(a+" "+b);
         }


        System.out.println(year);
    }
}
