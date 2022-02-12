package A;

import java.util.Scanner;

public class GravityFlip {
    public static boolean a[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new boolean[n][n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = sc.nextInt();

            fillblock(i,c,a);
        }
        print(a);


    }

    private static void fillblock(int i, int c,boolean b[][]) {
        for (int j = 0; j < c; j++) {
            b[i][j]=true;
        }
    }
    private static void print(boolean b[][]) {
        for (int j = 0; j < b.length; j++) {
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[j][i]+" ");
            }
            System.out.println();
        }
    }
}

