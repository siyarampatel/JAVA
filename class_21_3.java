/*pausing of another thread
*/
class MyThread extends Thread{ 
    public void run(){
        System.out.println("Output of "+Thread.currentThread().getName());  
        for(int i=0; i<5; i++){
            System.out.println(i+" thread 1");
        }
    }
}
class class_21_3{   
    public static void main(String [] args){
        System.out.println(Thread.currentThread().getName()); 
        MyThread t1 = new MyThread();
        t1.start(); //writing start instead of run
        try{
            t1.join(); // thread 1 will run first and main thread will be paused until thread 1 is running
        }catch(Exception e){

        }
        for(int i=0; i<5; i++){
            System.out.println(i+" main thread");
        }
    }
}