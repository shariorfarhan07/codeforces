package Lab5CPUScheduling;

import java.util.Scanner;

public class priority
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("enter no. of process: ");
        int num=in.nextInt();




        int burstTime[]=new int[num];


        for(int i=0;i<num;i++)
        {
            System.out.println("Enter the Burst time for "+(i+1)+": ");
            burstTime[i]=in.nextInt();
        }



        int P[]=new int[num];

        for(int i=0;i<num;i++)
        {
            System.out.println("Enter the Priority value time for "+(i+1)+": ");
            P[i]=in.nextInt();
        }



        int P1[]=new int[num];

        //define the priority values there

        for(int i=0;i<num;i++)
        {
            P1[i]=P[i];
        }



        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-1;j++)
            {
                if(P[j]>P[j+1])
                {
                    int tem=P[j];
                    P[j]=P[j+1];
                    P[j+1]=tem;
                }
            }
        }



        int wait=0;//initial value is 0;

        int wait_time[]=new int[num];



        float total=0;

        int k=0;

        System.out.println("Process\t\tBurst time\twaiting time");

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(P[i]==P1[j])
                {
                    System.out.println("p"+(j+1)+"\t\t"+burstTime[j]+"\t\t\t"+wait);
                    wait_time[k]=wait;
                    total+=wait;
                    wait+=burstTime[j];
                }
            }
        }

        System.out.println("The average waiting time is: "+(total/num));
    }
}