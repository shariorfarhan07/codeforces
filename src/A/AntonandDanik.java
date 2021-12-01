package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonandDanik {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
        String s= sc.readLine();
        int a=0,b=0;
        for (int i = 0; i <n ; i++) {
            if (s.charAt(i)=='A'){
                a++;
            }else if (s.charAt(i)=='D'){
                b++;
            }
        }
        if (a>b){
            System.out.println("Anton");
        }else if(a<b){
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }

    }
}
