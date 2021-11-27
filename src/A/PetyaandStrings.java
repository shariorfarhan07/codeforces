package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class PetyaandStrings {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(r);
        String a= sc.readLine().toLowerCase();
        String b= sc.readLine().toLowerCase();
        int c=0;

        for(int i =0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(i)){
                c=1;
                break;

            }else if (a.charAt(i)<b.charAt(i))
            {
                c=-1;
                break;

            }else{
                c=0;


            }
        }
        System.out.println(c);


    }


}
