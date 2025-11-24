/*if our code is too large and resides in single file then we can use packages there will be an main folder and multiple folders inside it 
then we will import the files in the class which has main method then uses that class afteer making the object.*/
import p1.A;
import p1.B;
public class class_13{
    public static void main(String [] args){
        A s1 = new A();
        B s2 = new B();
        s1.show();
        s2.show();
    }
}