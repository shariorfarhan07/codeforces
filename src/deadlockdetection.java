import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class deadlockdetection {
    static BufferedReader  bf;
    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new FileReader("src\\intputtest.txt"));




        int n =Integer.parseInt(bf.readLine());
        int m =Integer.parseInt(bf.readLine());




        boolean finish[]=new  boolean[m];




        LinkedList<Object> workChange=new LinkedList<Object>();


        int allocation[][]=new int[n][m];
        int request[][]=new int[n][m];
        int avaiable[]=new  int[m];
        int work[]=new  int[n];


        inputMatrix(allocation);
        inputMatrix(request);
        inputMatrix(avaiable);

        work=copy(avaiable);
        String sequence ="";
        String sequence1 ="";
        LinkedList<Integer> process=processleft(allocation,finish);
        int ResourseRequired[][]=required(allocation,request);
        int i=0;
        int count=0;
        while (!checkIfAnyProcessIsleft(finish)){
            boolean[] oldFinish =copy(finish);
            if (!finish[i] && checkTwoArrays(ResourseRequired[i],work) ) {
                System.out.println(1111);
                work = add(work, allocation[i]);
                finish[i] = true;
                workChange.add(work);
                sequence += (char) (i + 65) + " ";
                sequence1 += (i + 1) + " ";
            }
            if (isSame(oldFinish,finish)){
                count+=1;
                if (count==100)
                    break;
            }
            i++;
            i=i%finish.length;

        }

        System.out.println("Safe sequence is :");
        System.out.println(sequence);
        System.out.println("Change in available resource matrix :");
        while (!workChange.isEmpty()){
            printmatrix((int[]) workChange.pop());
        }
        printmatrix(finish);


    }

    public static boolean isSame(boolean[] a, boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            if (a[i]!=b[i])
                return false;
        }
        return true;
    }

    public static boolean[] copy(boolean[] a) {
        boolean b[]=new boolean[a.length];
        for (int i = 0; i < b.length; i++) {
            a[i]=b[i];
        }
        return b;
    }

    public static int[] copy(int[] a) {
        int b[]=new int[a.length];
        for (int i = 0; i < b.length; i++) {
            a[i]=b[i];
        }
        return b;
    }

    public static int[][] required(int[][] maxResourseRequired, int[][] allocationMatrix) {
       int ResourseRequired[][]=new int[maxResourseRequired.length][maxResourseRequired[0].length];
        for (int j = 0; j < ResourseRequired.length; j++) {
            ResourseRequired[j]=sub(maxResourseRequired[j],allocationMatrix[j]);
        }
        return ResourseRequired;
    }
    public static LinkedList<Integer> processleft(int[][] a, boolean[] f){
        LinkedList<Integer> process=new LinkedList<Integer>();
        int count=0;

        for (int i = 0; i < a.length; i++) {
            count=0;
            for (int j = 0; j < a[0].length; j++) {
             if (a[i][j]==0){
                 count+=0;
             }
            }
            if (count==f.length) {
                f[i] = true;
            }else {
                process.add(i);
            }


        }
        return process;
    }


    public static void inputMatrix(int []a) throws IOException{
        String st=bf.readLine();
        String[] stSplit=st.split(" ");
        for (int i = 0; i < a.length; i++) {

            a[i]= Integer.parseInt(stSplit[i]);
            System.out.println(a[i]);
        }

    }

    public static void inputMatrix(int [][] a) throws IOException {
        for (int i = 0; i < a[0].length; i++) {
            String st=bf.readLine();
            String[] stSplit=st.split(" ");
            for (int j = 0; j < a.length; j++) {
               System.out.println(Arrays.toString(stSplit)+" "+a[j].length+" "+a.length);
                int aa=Integer.parseInt(stSplit[j]);
                a[i][j]=aa;
              //  System.out.println(aa);
            }
        }
    }


    public static int[] add(int mat1[], int mat2[]){
        int c[]=new int[mat1.length];
        for (int i = 0; i < c.length; i++) {
            c[i]=mat1[i]+mat2[i];
        }
        return  c;
    }

    public static boolean checkTwoArrays(int need[], int work[]){
        for (int i = 0; i < need.length; i++) {
            if (need[i]>work[i]){
                return false;
            }
        }
        return  true;
    }

    public static int[] sub(int[] mat1, int[] mat2){
        int c[]=new int[mat1.length];
        for (int i = 0; i < c.length; i++) {
            c[i]=mat1[i]-mat2[i];
        }
        return  c;
    }




    public  static boolean checkIfAnyProcessIsleft(boolean processArray[]){
        int count=0;
        boolean ReturnVar = true;
        for (int pro = 0; pro < processArray.length; pro++) {
            if (processArray[pro]) {
                count+=1;
            }
        }
        if (count==processArray.length){
            ReturnVar=false;
        }
        return ReturnVar;
    }

    public static void printmatrix(boolean[] a) throws IOException{
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void printmatrix(int []a) throws IOException{
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}

