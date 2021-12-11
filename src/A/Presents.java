package A;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int recived[]=new int[n+1];
        int recivedFrom[]=new int[n+1];

        for (int i = 1; i < n+1; i++) {
            recived[i]=sc.nextInt();
        }
        for (int i = 1; i < n+1; i++) {
            recivedFrom[recived[i]]=i;
        }

        for (int i = 1; i < n+1; i++) {
            System.out.print(recivedFrom[i]);
            if (i<=n)
                System.out.print(" ");
        }
        System.out.println();



    }
}
