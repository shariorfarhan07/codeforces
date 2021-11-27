package A;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[5][5];

        for(int r=0;r<5;r++){
            for(int c=0;c<5;c++){
                mat[r][c]= sc.nextInt();
            }
        }
        int posR=0,posC=0;
        for(int r=0;r<5;r++){
            for(int c=0;c<5;c++){
               if (mat[r][c]==1){
                   posC=c;
                   posR=r;
               }
            }
        }
        count=Math.abs(2-posC)+Math.abs(2-posR);
        System.out.println(count);



    }

}
