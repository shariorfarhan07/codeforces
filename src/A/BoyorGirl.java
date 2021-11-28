package A;

import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char [] st=name.toCharArray();
        int count=0;
        for(int i=0;i<st.length;i++){
          if(name.indexOf(st[i])!=-1){
              name=name.replace(""+st[i],"");
              count+=1;
            //  System.out.println(name);
          }

        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
