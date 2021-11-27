package A;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine().trim();
        String ouput=word.toUpperCase().substring(0,1)+word.substring(1);
        System.out.println(ouput);

    }
}
