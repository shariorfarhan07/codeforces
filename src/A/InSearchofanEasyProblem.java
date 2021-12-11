package A;

import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        boolean t=false;
        for (int i = 0; i < n; i++) {
            int opinion= sc.nextInt();
            if (opinion == 1){
                t=true;
            }
        }
        if (t)
        System.out.println("HARD");
        else{
            System.out.println("EASY");
        }
    }
}
