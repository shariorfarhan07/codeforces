package A;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((int)Math.pow(-1,n)*(n+1)/2);
    }
}
