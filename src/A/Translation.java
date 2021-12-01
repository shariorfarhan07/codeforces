package A;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        String t=sc.nextLine();
        boolean tt=true;
       // System.out.println(s);
       // System.out.println(t);
        if (s.length()==t.length())
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!=t.charAt(s.length()-i-1)){
            tt=false;
            }
        }
        else{
            tt=false;
        }
        if (tt){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
