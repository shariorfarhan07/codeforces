package A;

import java.util.Scanner;

public class VanyaandFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int h=sc.nextInt();
        int height[]=new int[n];
        int roadwidth=0;
        for (int i = 0; i < n; i++) {
            int friendHeight=sc.nextInt();
            if (friendHeight>h){
                roadwidth+=2;
            }else {
                roadwidth+=1;
            }
        }
        System.out.println(roadwidth);

    }
}
