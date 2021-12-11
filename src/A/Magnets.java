package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Magnets {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int count=0;
        String newMag="";
        String oldMag="";
        for (int i = 0; i < n; i++) {
            newMag=br.readLine();
            if (!newMag.equals(oldMag)){
                count+=1;
            }
            oldMag=newMag;
        }
        System.out.println(count);
    }
}
