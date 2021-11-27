package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bitplusplus {


    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(r);
        int n=Integer.parseInt(sc.readLine());
        int x=0;
        for(int i =0 ;i<n; i++){
            String st=sc.readLine();
            //System.out.println(st);
            if (st.equals("X++") ||st.equals("++X"))
                x++;
            else if (st.equals("X--") ||st.equals("--X"))
                x--;
        }

        System.out.println(x);
    }


}
