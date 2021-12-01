package A;

import java.util.Scanner;

public class GeorgeandAccommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q,p,sum=0;
        for (int i = 0; i < n; i++) {
            p= sc.nextInt();
            q=sc.nextInt();
            if (q-p>=2){
                sum+=1;
            }
        }
        System.out.println(sum);

    }
}
