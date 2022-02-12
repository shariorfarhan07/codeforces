import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class bankersAlgoCse321 {
    static BufferedReader  bf;
    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new FileReader("src\\input.txt"));




        int n =Integer.parseInt(bf.readLine());
        int m =Integer.parseInt(bf.readLine());




        boolean finish[]=new  boolean[n];



        int avaiableResource[]=new  int[n];
        LinkedList<Object> workChange=new LinkedList<Object>();


        int ResourseRequired[][]=new  int[n][m];
        int maxResourseRequired[][]=new int[n][m];
        int allocationMatrix[][]=new int[n][m];




        int work[]=new int[m];
        String sequence="";
        int i=0;

        inputMatrix(maxResourseRequired);
        inputMatrix(allocationMatrix);
        Inputmatrix(work);

        for (int j = 0; j < n; j++) {
            ResourseRequired[j]=sub(maxResourseRequired[j],allocationMatrix[j]);
        }
     //   System.out.println(checkProcess(finish)+"test");
        while (checkIfAnyProcessIsleft(finish)){
            //System.out.println( lessthan(ResourseRequired[i],work) +" "+!finish[i] );
            if (!finish[i] && checkTwoArrays(ResourseRequired[i],work) ){
                work=add(work,allocationMatrix[i]);
                finish[i]=true;
                workChange.add(work);
                sequence+=(char)(i+65)+" ";

            }
            i++;
            i=i%finish.length;
        }

        System.out.println("Need Matrix");
        for (int ii = 0; ii < ResourseRequired.length; ii++) {
            for (int j = 0; j < ResourseRequired[ii].length; j++) {
                System.out.print(ResourseRequired[ii][j]+" ");
            }
            System.out.println();
        }



        System.out.println("Safe sequence is :");
        System.out.println(sequence);
        System.out.println("Change in available resource matrix :");
        while (!workChange.isEmpty()){
            printmatrix((int[]) workChange.pop());
        }








    }


    public static void Inputmatrix(int []a) throws IOException{
        String st=bf.readLine();
        String[] stSplit=st.split(" ");
        for (int i = 0; i < a.length; i++) {
            a[i]= Integer.parseInt(stSplit[i]);
        }

    }

    public static void inputMatrix(int [][] a) throws IOException {
        for (int i = 0; i < a.length; i++) {
            String st=bf.readLine();
            String[] stSplit=st.split(" ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=Integer.parseInt(stSplit[j]);
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
    
    public static void printmatrix(int []a) throws IOException{
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}

