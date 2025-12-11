/*creation of another thread both the thread will work parallely but output will be random also the notations are pre defined 
*/
class MyThread extends Thread{ //Thread class is inbuilt
    public void run(){
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());  
        for(int i=0; i<5; i++){
            System.out.println(i+"thread 1");
        }
    }
}
class class_21_2{   
    public static void main(String [] args){
        System.out.println(Thread.currentThread().getName()); 
        MyThread t1 = new MyThread();
        t1.start();                   //start keyword is fixed here then only the new thread will be created
        for(int i=0; i<5; i++){
            System.out.println(i+"main thread");
        }
    }
}