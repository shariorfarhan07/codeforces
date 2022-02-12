package lab3Threads;//Task1

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value1:");
        int value1= sc.nextInt();
        System.out.println("Enter value2:");
        int value2= sc.nextInt();

        Thread add =new Thread(new Add(value1,value2));
        Thread sub =new Thread(new Sub(value1,value2));
        Thread mul =new Thread(new Mul(value1,value2));
        Thread div =new Thread(new Div(value1,value2));
        add.start();
        sub.start();
        mul.start();
        div.start();

    }


}
class Add implements Runnable{
    int a,b;
    public Add(int x,int y){
        a=x;
        b=y;
    }



    @Override
    public void run() {
        int result= a+b;
        System.out.println(a+"+"+b+"="+result);
    }
}

class Sub implements Runnable{
    int a,b;
    public Sub(int x,int y){
        a=x;
        b=y;
    }



    @Override
    public void run() {
        int result= a-b;
        System.out.println(a+"-"+b+"="+result);
    }
}

class Mul implements Runnable{
    int a,b;
    public Mul(int x,int y){
        a=x;
        b=y;
    }



    @Override
    public void run() {
        int result= a*b;
        System.out.println(a+"*"+b+"="+result);
    }
}

class oth implements Runnable{
    int a,b;
    public oth(int x,int y){
        a=x;
        b=y;
    }



    @Override
    public void run() {
        if(b==0) {
            System.out.println("No valid operation");
        }else{
            System.out.println("valid operation");
        }
    }
}


class Div implements Runnable{
    int a,b;
    public Div(int x,int y){
        a=x;
        b=y;
    }



    @Override
    public void run() {
        if(b!=0)
            System.out.println(a+"/"+b+"="+(a/b));
        else
            System.out.println("divisor cant be zero");
    }
}

