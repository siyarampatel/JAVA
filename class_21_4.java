/*pausing of another thread
*/
class MyThread extends Thread{ 
    public void run(){
        System.out.println("Output of "+Thread.currentThread().getName());  
        for(int i=0; i<5; i++){
            System.out.println(i+" thread 1");
            try{
                Thread.sleep(1000); //Now this thread will take pauses for given time.
            }catch(Exception e){

            }
        }
    }
}
class class_21_4{   
    public static void main(String [] args){
        System.out.println(Thread.currentThread().getName()); 
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0; i<5; i++){
            System.out.println(i+" main thread");
        }
    }
}