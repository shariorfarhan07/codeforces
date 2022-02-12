package Lab5CPUScheduling;

import java.util.Scanner;

public class RoundRobin
{
    static void rr(int n,int arivalTime[],int  burstTime[],int quantum)
    {
        int remainingBurstTime[]=new int[n];
        for(int i=0;i<n;i++)
        {
            remainingBurstTime[i]= burstTime[i];
        }
        int completiontime[]=new int[n];
        int t=0;
        while(true)
        {
            boolean done=true;
            for(int i=0;i<n;i++)
            {
                if(remainingBurstTime[i]>0)
                {
                    done=false;
                    if(remainingBurstTime[i]>quantum && arivalTime[i]<=t)
                    {
                        t+=quantum;
                        remainingBurstTime[i]-=quantum;
                    }
                    else
                    {
                        t+=remainingBurstTime[i];
                        remainingBurstTime[i]=0;
                    }
                    if(remainingBurstTime[i]==0)
                    {
                        completiontime[i]=t;
                    }
                }

            }
            if(done==true)
                break;
        }
        int tat[]=new int[n];
        for(int i=0;i<n;i++)
        {
            tat[i]=completiontime[i]-arivalTime[i];
        }
        int waiting_time[]=new int[n];
        for(int i=0;i<n;i++)
        {
            waiting_time[i]=tat[i]- burstTime[i];
        }
        System.out.println("Process  arrival_time  burst_time  turn_around_time  waiting_time ");
        int total_tat=0,total_waiting=0;
        for(int i=0;i<n;i++)
        {
            total_tat+=tat[i];
            total_waiting+=waiting_time[i];
            System.out.println("P"+(i+1)+"\t\t\t"+arivalTime[i]+"\t\t\t"+ burstTime[i]+"\t\t\t"+tat[i]+"\t\t\t"+waiting_time[i]);
        }

        System.out.println("Average turn around time = "+(total_tat)/n);
        System.out.println("Average waiting time = "+(total_waiting)/n);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. processors");
        int n=sc.nextInt();
        int bt[]= new int[n];
        int at[]=  new int[n];

        System.out.println("enter time quantum");
        int quantum=3;
        System.out.println("start entering values");
        for (int i = 0; i < n; i++) {
            System.out.println("p"+(i+1)+"burst time:");
            bt[i]= sc.nextInt();
            System.out.println("p"+(i+1)+"arival time:");
            at[i]= sc.nextInt();
        }

        rr(n,at,bt,quantum);
    }
}