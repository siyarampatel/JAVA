//Abstraction payment code

abstract class payment{
    abstract void pay(int a);
    void success(){
        System.out.println("PAYMENT SUCCESSFULL");
    }
}

class upiPayment extends payment{
    void pay(int a){
        System.out.println("Payment done through UPI");
    }
}

class oflinePayment extends payment{
    void pay(int a){
        System.out.println("Direct transfer");
    }
}

class class_10_5{
    public static void main(String [] args){
        payment p = new upiPayment();
        p.pay(5000);
        payment p1 = new oflinePayment();
        p1.pay(6908);
    }
}