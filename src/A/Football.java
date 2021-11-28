package A;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String player= sc.nextLine();
        if (player.contains("1111111")||player.contains("0000000")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
