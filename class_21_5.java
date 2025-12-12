class MyThread extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Downloading File...."+10*i+"%");
            try{
                Thread.sleep(3000);
            }catch(Exception e){

            }
        }
    }
}

class class_21_5{
    public static void main(String [] args){
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0; i<=5; i++){
            System.out.println("Updating File...."+10*i+"%");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                
            }
        }
    }
}