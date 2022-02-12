package lab3Threads;

//Task3


public class task3 {
    public static long task[];

    static {
        task = new long[5];
    }

    public static void main(String[] args) {
// sir long/double cant handle this number aslo... i did it as moshiur sir said ... didn't try biginteger because it takes string type numbers as input.
        Thread finalAvg;
        long fibonacci[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,
                28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352,
                24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903,
        };
        Thread task1 =new Thread(new FindMean(fibonacci,1,0,(fibonacci.length/2)-1,0));
        Thread task2 =new Thread(new FindMean(fibonacci,0,0,(fibonacci.length/2)-1,1));
        Thread task3 =new Thread(new FindMean(fibonacci,1,fibonacci.length/2,fibonacci.length-1,2));
        Thread task4 =new Thread(new FindMean(fibonacci,0,fibonacci.length/2,fibonacci.length-1,3));
        //System.out.println(fibonacci.length);
        task1.start();
        task2.start();
        task3.start();
        task4.start();

        try {
            task1.join();
            task2.join();
            task3.join();
            task4.join();


            finalAvg =new Thread(new FindMean(task));
            finalAvg.start();
            finalAvg.join();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("total average ="+task[4]);

    }

    static class FindMean implements Runnable{

        long fibonacci[];
        int start;
        int end;
        int div;
        int t;
        boolean totalavg;

        public FindMean(long a[],int oldEven,int start, int end, int task){
            fibonacci=a;
            this.start=start;
            this.end=end;
            this.div=oldEven;
            this.t=task;
            totalavg=false;

        }

        public FindMean(long[] task) {
            fibonacci=task;
            this.start=0;
            this.end=task.length-2;
            this.div=0;
            this.t=4;
            totalavg=true;


        }


        @Override
        public void run() {
            long sum=0;
            int count=0;
            for(int i=start;i<=end;i++){
                if(fibonacci[i]%2==div || totalavg) {
                    sum += fibonacci[i];
                    count+=1;
                }
            }
            // System.out.println(count+" "+sum);
            try{
                task[t]=sum/count;
            } catch (Exception e) {
                task[t]=0;
            }
            System.out.println("task "+(t+1)+" average: "+task[t]);

        }
    }
}