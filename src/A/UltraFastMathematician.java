package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltraFastMathematician {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        String output="";
        int max=Math.max(s1.length(),s2.length());
        for (int i = 0; i < max; i++) {
            if (s1.charAt(i)==s2.charAt(i))
                output+="0";
            else
                output+="1";
        }
        System.out.println(output);
    }
}
