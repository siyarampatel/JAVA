/*Write a program where a base class Vehicle has a startEngine method.
(method overriding)
The subclass Car should override this method to display "Car engine started". Create an instance of Car and call the startEngine method.
*/

class vehicle{
    void startEngine(){
        System.out.println("Engine is started");
    }
}

class car extends vehicle{
    void startEngine(){
        System.out.println("Car engine started");
    }
}

class class9_9{
    public static void main(String [] args){
        car c = new car();
        c.startEngine();
    }
}