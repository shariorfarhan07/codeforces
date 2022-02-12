package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseandConcatenate {
    static  BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {


        int t = Integer.parseInt(bf.readLine());
        String rt;
        for (int i = 0; i < t; i++) {
            String[] s=takeinput();
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Stack<String> stack = new Stack<String>();
            stack.push(takeinput()[0].substring(0,n));
            stack.push(stack.peek());
            int count=0;
            for (int j = 0; j < k; j++) {
                String s1=stack.pop();
                String s2=reverses(stack.pop());
//                System.out.println(s1+" "+s2);
                if (!(s1+s2).equals(s2+s1)){
                    count++;
                    stack.push(s1+s2);
                    stack.push(s2+s1);
                }

            }
            System.out.println(count==0?1:count);
        }
    }

    private static String[] takeinput() throws IOException {
    return bf.readLine().trim().split(" ");
    }


    public static String  reverses(String s){
        String t ="";
        for (int i = 0; i < s.length(); i++) {
            t=s.charAt(i)+t;
        }
        return t;
    }
}
