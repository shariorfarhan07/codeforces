package A;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String exp=scanner.nextLine();
        char [] value=exp.toCharArray();
        Arrays.sort(value);
        //System.out.println(value.length);
        String out="";
        for(char v:value ){
           // System.out.println(v);
            if(v!='+'){
                out+=v+"+";
            }
        }
        System.out.println(out.substring(0,out.length()-1));
    }
}
