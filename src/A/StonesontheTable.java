package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StonesontheTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int count=0;
        String st = br.readLine();
        for(int i =1;i<n;i++){
            if(st.charAt(i-1)==st.charAt(i))
                count+=1;
        }
        System.out.println(count);

    }
}
