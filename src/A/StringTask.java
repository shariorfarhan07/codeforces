package A;


import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] v={ 'a', 'o', 'y', 'e', 'u', 'i'};
        String input= scanner.nextLine().toLowerCase();
        String output="";
        for(int i =0 ; i<input.length();i++){
            if (!match(v,input.charAt(i))){
            output+="."+input.charAt(i);
            }
        }
        System.out.println(output);
    }
    public static boolean match(char[]c,char m){
        for(int i=0;i<c.length;i++){

                //System.out.println(c[i]+"  "+m);
            if( c[i]==m){
                return  true;}
        }
        return  false;

    }
}
