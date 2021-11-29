package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QueueattheSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String[] tt=sc.readLine().trim().split(" ");
        int n= Integer.parseInt(tt[0]);
        int t=Integer.parseInt(tt[1]);
        String s=sc.readLine().toUpperCase();
        char c[]=s.toCharArray();
        for (int i = 0; i <t ; i++) {
          //  System.out.println(i);
            for (int j = 0; j <n-1 ; j++) {
                if (c[j+1]=='G' && c[j] == 'B'){
                    //System.out.println(c[j]+" "+c[j+1]);
                    c[j]='G';
                    c[j+1]='B';
                    j++;
                }
              //  System.out.println(Arrays.toString(c));
            }
        }
      //  System.out.println( c.toString());
        s="";
        for (int i = 0; i <c.length ; i++) {
            s+=c[i];
        }
        System.out.println(s);
    }
}
