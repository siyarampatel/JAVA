class myThread implements Runnable{
    public void run(){
        System.out.println("hello");
        for(int i=0; i<5; i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }
}
class class_22_1{
    public static void main(String [] args){
        myThread task = new myThread();
        Thread t1 = new Thread(task); /*Two new threads (t1 and t2) run the same run() work in parallel.
                                       Main thread only starts them and does no work.*/
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
