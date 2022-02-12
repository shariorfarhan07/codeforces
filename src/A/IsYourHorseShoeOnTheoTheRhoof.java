package A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class IsYourHorseShoeOnTheoTheRhoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Long> hash_Set = new HashSet<Long>();
        long input[]=new long[4];
        for (int i = 0; i < 4; i++) {
            hash_Set.add( sc.nextLong() );
        }
        System.out.println(4-hash_Set.size());
    }
}
