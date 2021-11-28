package A;

import java.util.Scanner;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i*k;
        }
        System.out.println(sum-w<0?0:sum-w);
      //  System.out.println(sum);
    }
}
