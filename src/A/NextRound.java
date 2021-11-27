package A;


import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        int score[] = new int[n];

        for(int i =0 ;i<n ; i++){
            score[i]=sc.nextInt();
        }
        int count=0;

        int minScore =score[k-1];
        for(int i =0 ;i<n ; i++){
            if (minScore<=score[i]&& score[i]>0){
                count+=1;
            }
        }

        System.out.println(count);





    }

}
