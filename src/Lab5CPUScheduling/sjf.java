package Lab5CPUScheduling;

import java.util.Scanner;

/**
 * Created by hadiana_sliwa on 12/1/18.
 */

public class sjf {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter no of process:");
        int n = sc.nextInt();
        int pid[] = new int[n];
        int arrivalTime[] = new int[n];
        int burstTime[] = new int[n];
        int turnAroundTime[] = new int[n];
        int waitingTime[] = new int[n];

        int f[] = new int[n];
        int ct[] = new int[n];
        int st=0, tot=0;
        float avgwaitingTime=0, avgturnAroundTime=0;

        for(int i=0;i<n;i++)
        {
            System.out.println ("enter process " + (i+1) + " arrival time:");
            arrivalTime[i] = sc.nextInt();
            System.out.println ("enter process " + (i+1) + " brust time:");
            burstTime[i] = sc.nextInt();
            pid[i] = i+1;
            f[i] = 0;
        }


        while(true)
        {
            int c=n, min = 999999;

            if (tot == n)
                break;

            for (int i=0; i<n; i++)
            {

                if ((arrivalTime[i] <= st) && (f[i] == 0) && (burstTime[i]<min))
                {
                    min=burstTime[i];
                    c=i;
                }
            }
            if (c==n)
                st++;
            else
            {
                ct[c]=st+burstTime[c];
                st+=burstTime[c];
                turnAroundTime[c]=ct[c]-arrivalTime[c];
                waitingTime[c]=turnAroundTime[c]-burstTime[c];
                f[c]=1;
                pid[tot] = c + 1;
                tot++;
            }
        }

        System.out.println("\npid  arrival brust  complete turn waiting");
        for(int i=0;i<n;i++)
        {
            avgwaitingTime+= waitingTime[i];
            avgturnAroundTime+= turnAroundTime[i];
            System.out.println(pid[i]+"\t\t"+arrivalTime[i]+"\t\t"+burstTime[i]+"\t\t"+ct[i]+"\t\t"+turnAroundTime[i]+"\t\t"+waitingTime[i]);
        }
        System.out.println ("\nAverage Turn Around Time t is "+ (float)(avgturnAroundTime/n));
        System.out.println ("Average Waiting Time is "+ (float)(avgwaitingTime/n));
    
        for(int i=0;i<n;i++)
        {
            System.out.print(pid[i] + " ");
        }
    }
}