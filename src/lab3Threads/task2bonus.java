
//Task2(bonus)


public class task2bonus {

    static class  House extends Thread{
        public int wait;
        public House(String name,int wait){
            setName(name);
            this.wait=wait;
        }
        public void run() {
            System.out.println("House "+getName());
            try {
                this.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }



    public static void main(String[] args) {
        House house1=new House("Stark",5000 );
        house1.setPriority(Thread.MAX_PRIORITY);

        House house2=new House("Targaryen",1000 );
        House house3=new House("Lannister",5000 );

        House house4=new House("Bolton",3000 );
        house4.setPriority(Thread.MIN_PRIORITY);
        House house5=new House("Tyrell",5000 );


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
