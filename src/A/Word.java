package A;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int countCap=0,countSmall=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                countSmall++;
            }else if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                countCap++;
            }
        }
        if (countCap>countSmall){
            System.out.println(s.toUpperCase());
        }else {
            System.out.println(s.toLowerCase());
        }
    }
}
