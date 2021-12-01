package A;

import java.util.Scanner;

//        "H" prints "Hello, World!",
//        "Q" prints the source code of the program itself,
//        "9" prints the lyrics of "99 Bottles of Beer" song,
//        "+" increments the value stored in the internal accumulator.
public class HQ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        boolean yes=false;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i)=='H'||t.charAt(i)=='Q'||t.charAt(i)=='9'){
                yes=true;
                break;
            }else if(t.charAt(i)=='+'){

//                if ((i==0 || i==t.length()-1)&&t.length()>2&& i!=t.length()-1)
//                {yes=true;
//                 break;}
//
//                if (i>0 && i< t.length()-1 )
//
//                if ((t.charAt(i-1)<='a' || t.charAt(i-1)>='z')||(t.charAt(i+1)<='a' || t.charAt(i+1)>='z'))
//                { yes=false;
//                    }
//                else {
//                    yes = true;
//                    break;
//                }

            }
        }
        if (yes){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
