package B;

import java.util.Arrays;
import java.util.Scanner;

public class taxi_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int c;
        int group[] = new int[4];

        for (int i = 0; i < n; i++) {
            c = sc.nextInt();

            if (c == 4) {
                count++;
            } else {
                group[c]++;
            }
        }
//        System.out.println(Arrays.toString(group));
//        System.out.println(count);


        // for two
        if (group[2]>1){
            count+=group[2]/2;
            group[2]-=(group[2]/2)*2;
        }

//        System.out.println(Arrays.toString(group));
//        System.out.println(count);


        //for three and one
        if (group[3]>0&&0<group[1])
            if (group[3]>group[1]){
                count+=group[3];
                group[3]=0;
                group[1]=0;
            }else {
                count+=group[3];
                group[1]-=group[3];
                group[3]=0;
            }
//        System.out.println(Arrays.toString(group));
//        System.out.println(count);




        // for two and one
        if (group[2]*2<group[1]){
            count+=group[2];
            group[1]-=group[2]*2;
            group[2]=0;
        }else{
            count+=group[2];
            group[1]=0;
            group[2]=0;
        }
//        System.out.println(Arrays.toString(group));
//        System.out.println(count);



        // for one
        if (group[1]>0){
            if (group[1]>=4){
                count+=group[1]/4;
                group[1]-=(group[1]/4)*4;
//                System.out.println(Arrays.toString(group));
//                System.out.println(count);
            }
            if (group[1]%2==1||group[1]==2){
                count++;
                group[1]=0;
            }
//            System.out.println(Arrays.toString(group));
//            System.out.println(count);
        }

//        System.out.println(Arrays.toString(group));
//        System.out.println(count);

        //for three
        if (group[3]>0){
            count+=group[3];
            group[3]=0;
        }


        System.out.println(count);




    }
}