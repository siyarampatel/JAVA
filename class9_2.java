class device{
    void powerOn(){
        System.out.println("POWER IS ON");
    }
}

class laptop extends device{
    void boot(){
    System.out.println("DEVICE IS BOOTING ");
    }
}

class gaminglaptop extends laptop{
   void startGame(){
    System.out.println("THE GAME IS STARTING");
   }
}

class class9_2{
    public static void main(String [] args){
        gaminglaptop g = new gaminglaptop();
        g.powerOn();
        g.boot();
        g.startGame();
    }
}