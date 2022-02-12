package lab3Threads;



//Task2



public class task2 {
//      House Stark
//
//    House Targaryen
//
//    House Lannister
//
//    House Bolton
//
//   House Tyrell

    public static void main(String[] args) {
        house house1=new house("Stark" );
        house1.setPriority(Thread.MAX_PRIORITY);

        house house2=new house("Targaryen" );
        house house3=new house("Lannister" );

        house house4=new house("Bolton" );
        house4.setPriority(Thread.MIN_PRIORITY);
        house house5=new house("Tyrell" );


//        System.out.println(house1.getPriority());
//        System.out.println(house2.getPriority());
//        System.out.println(house3.getPriority());
//        System.out.println(house4.getPriority());
//        System.out.println(house5.getPriority());

        System.out.println("single threaded");
        house1.run();
        house2.run();
        house3.run();
        house4.run();
        house5.run();





        System.out.println("\n\n\nmulti threaded");

        house1.start();
        house2.start();
        house3.start();
        house4.start();
        house5.start();

        if(house1.isAlive()){
            System.out.println("Not Today!");
        }
        if(!house4.isAlive()){
            System.out.println("You know nothing!");
        }





    }

}
class  house extends Thread{
    public house(String name){
        setName(name);
    }
    public void run() {
        System.out.println("House "+getName());


    }
}

