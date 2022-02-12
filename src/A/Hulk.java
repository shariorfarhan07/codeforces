package A;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String s[]={"I hate ","I love "};
        String ss="";
        for (int i = 0; i < n; i++) {
            ss+=s[i%2];
            if (n==i+1){ss+="it";}
            else{
                ss+="that ";
            }
        }
        System.out.println(ss);
    }
}
